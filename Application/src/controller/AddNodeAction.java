package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import app.MainFrame;
//import gui.MainFrame;
import model.Pacijent;
import model.PacijentCvor;
import model.PregledCvor;
import model.PregledPacijenta;
import model.Workspace;

public class AddNodeAction extends AbstractAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int incPacijent;
	private static int incPregled;
	
	private ArrayList<String> listaSimptoma;
	private ArrayList<String> listaLekova;
	private ArrayList<String> listaTerapija;
	private String bolest;

	public AddNodeAction() {
		// TODO Auto-generated constructor stub
	}

	public AddNodeAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public AddNodeAction(String name, Icon icon) {
		super(name, icon);
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent e) {
		DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) MainFrame.getInstance().getTree().getLastSelectedPathComponent();
		if(parentNode==null){
			return;
		}
		
		if(parentNode.getUserObject() instanceof Workspace){
			Workspace root = (Workspace)parentNode.getUserObject();
			int count=incPacijent++;
			//Pacijent pacijent = new Pacijent(""+count, "");
			Pacijent pacijentNovi = new Pacijent();
		//	Pacijent pacijent = new Pacijent("Jovan", "Jovanovic");
			Pacijent pacijent = new Pacijent(pacijentNovi.getIme(), pacijentNovi.getPrezime());
			PacijentCvor sledeciSloj= new PacijentCvor("Pacijent"+count, "",root);
			//PacijentCvor sledeciSloj= new PacijentCvor(pacijent.getIme(),pacijent.getPrezime(),root);
			sledeciSloj.setKarton(pacijent);
			root.addChildren(sledeciSloj);
			
			DefaultMutableTreeNode dete=new DefaultMutableTreeNode(sledeciSloj);
			DefaultTreeModel model = MainFrame.getInstance().getModel();
			 model.insertNodeInto(dete,parentNode,parentNode.getChildCount());
			
			/*JTree tree=MainFrame.getInstance().getTree();
			tree.setSelectionPath(new TreePath(dete.getPath()));
			tree.scrollPathToVisible(new TreePath(dete.getPath()));*/
		
		}else if(parentNode.getUserObject() instanceof PacijentCvor){
			int count2=incPregled++;
			listaSimptoma = new ArrayList<String>();
			listaLekova = new ArrayList<String>();
			listaTerapija = new ArrayList<String>();
			
			
			PacijentCvor root2 = (PacijentCvor)parentNode.getUserObject();
			PregledPacijenta pregled=new PregledPacijenta(listaSimptoma, listaLekova, listaTerapija, bolest);
			
			PregledCvor sloj2= new PregledCvor("Pregled"+count2,root2);
			sloj2.setPregled(pregled);
			root2.addChildren(sloj2);
			
			DefaultMutableTreeNode dete=new DefaultMutableTreeNode(sloj2);
			
			DefaultTreeModel model = MainFrame.getInstance().getModel();
			model.insertNodeInto(dete,parentNode,parentNode.getChildCount());

			 
			 
			 
			JTree tree = (JTree) MainFrame.getInstance().getTree();
			tree.setSelectionPath(new TreePath(dete.getPath()));
			tree.scrollPathToVisible(new TreePath(dete.getPath()));
			
			
		}
			
	}

}
