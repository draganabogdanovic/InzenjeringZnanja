package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import app.MainFrame;
import model.PacijentCvor;
import model.PregledCvor;
import model.PregledPacijenta;

public class AddCaseAction extends AbstractAction{
	private ArrayList<String> listaSimptoma;
	private ArrayList<String> listaLekova;
	private ArrayList<String> listaTerapija;
	private String bolest;
	
	private static int incP;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	
		DefaultMutableTreeNode element = (DefaultMutableTreeNode) MainFrame.getInstance().getTree()
				.getLastSelectedPathComponent();
	
		if(element == null) {
		
			JOptionPane.showMessageDialog(MainFrame.getInstance(), "Izaberite pacijenta!", "Greska!",
					JOptionPane.WARNING_MESSAGE);
			return;
			
		}
		
		DefaultMutableTreeNode parentNode =(DefaultMutableTreeNode) MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		if(parentNode==null){
			return;
		}	
		if(parentNode.getUserObject() instanceof PacijentCvor){
			int count2=incP++;
			listaSimptoma = new ArrayList<String>();
			listaLekova = new ArrayList<String>();
			listaTerapija = new ArrayList<String>();
			
			
			PacijentCvor root2 = (PacijentCvor)parentNode.getUserObject();
			PregledPacijenta pregled=new PregledPacijenta(listaSimptoma, listaLekova, listaTerapija, bolest);
			
			PregledCvor sloj2= new PregledCvor("PregledCase"+count2,root2);
			sloj2.setPregled(pregled);
			root2.addChildren(sloj2);
			
			DefaultMutableTreeNode dete=new DefaultMutableTreeNode(sloj2);
			DefaultTreeModel model=MainFrame.getInstance().getModel();
			 model.insertNodeInto(dete,parentNode,parentNode.getChildCount());
			
			 
			JTree tree=(JTree) MainFrame.getInstance().getTree();
			tree.setSelectionPath(new TreePath(dete.getPath()));
			tree.scrollPathToVisible(new TreePath(dete.getPath()));
		}
		
	}
}
