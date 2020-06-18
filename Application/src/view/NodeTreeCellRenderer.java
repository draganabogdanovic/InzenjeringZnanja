package view;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import model.PacijentCvor;
import model.PregledCvor;
import model.Workspace;



public class NodeTreeCellRenderer extends DefaultTreeCellRenderer{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NodeTreeCellRenderer() {
	}

	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,
			int row, boolean hasFocus) {
super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
		
		if(((DefaultMutableTreeNode)value).getUserObject() instanceof Workspace){
			setIcon(new ImageIcon("img/files.png"));
		}else if(((DefaultMutableTreeNode)value).getUserObject() instanceof PacijentCvor){
			setIcon(new ImageIcon("img/patient.png"));
		}else if(((DefaultMutableTreeNode)value).getUserObject() instanceof PregledCvor){
			setIcon(new ImageIcon("img/doctor.png"));
		}
		return this;
	}

}

