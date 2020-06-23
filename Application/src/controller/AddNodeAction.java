package controller;

import java.awt.event.ActionEvent;

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
import model.Workspace;

public class AddNodeAction extends AbstractAction{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int incPacijent;

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
			Pacijent pacijentNovi = new Pacijent();
			Pacijent pacijent = new Pacijent(pacijentNovi.getIme(), pacijentNovi.getPrezime(), pacijentNovi.getJMBG());
			PacijentCvor sledeciSloj= new PacijentCvor("Pacijent"+count, "",root);
			sledeciSloj.setKarton(pacijent);
			root.addChildren(sledeciSloj);
			
			DefaultMutableTreeNode dete=new DefaultMutableTreeNode(sledeciSloj);
			DefaultTreeModel model = MainFrame.getInstance().getModel();
			 model.insertNodeInto(dete,parentNode,parentNode.getChildCount());
			
			JTree tree=MainFrame.getInstance().getTree();
			tree.setSelectionPath(new TreePath(dete.getPath()));
			tree.scrollPathToVisible(new TreePath(dete.getPath()));
		
		}
			
	}

}
