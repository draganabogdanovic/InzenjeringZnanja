package view;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;

import app.MainFrame;


public class CellEditor extends DefaultTreeCellEditor{

	public CellEditor(JTree tree,DefaultTreeCellRenderer renderer){
		super(tree,renderer);
	}
	
	public CellEditor(JTree tree, DefaultTreeCellRenderer renderer, TreeCellEditor editor){
		super(tree,renderer,editor);
	}
	
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row){
		DefaultMutableTreeNode sel=(DefaultMutableTreeNode) MainFrame.getInstance().getTree().getSelectionPath().getLastPathComponent();
	
		
		
		return super.getTreeCellEditorComponent(tree, value, isSelected, expanded, leaf, row);
	}

}
