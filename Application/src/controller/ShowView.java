package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import app.MainFrame;
import model.Pacijent;
import model.PacijentCvor;
import model.PregledCvor;
import model.Workspace;

public class ShowView extends AbstractAction{
	public int typeObject;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		DefaultMutableTreeNode NodeView=(DefaultMutableTreeNode) MainFrame.getInstance().getTree().getLastSelectedPathComponent();
	
		if(NodeView==null){
			return;
		}
		
		if(NodeView.getUserObject() instanceof Workspace){
			return;
		}else if(NodeView.getUserObject() instanceof PacijentCvor){
			typeObject=1;
		
		}else if(NodeView.getUserObject() instanceof PregledCvor){
			typeObject=2;
			
		}else if(NodeView.getUserObject() instanceof Pacijent){
			typeObject=3;


		}
		
	}

}
