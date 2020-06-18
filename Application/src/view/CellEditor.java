package view;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;

import app.MainFrame;
import model.Pacijent;
import model.PacijentCvor;
import model.PregledCvor;


public class CellEditor extends DefaultTreeCellEditor{

	private PacijentCvor selectedKartonNode;
	private PregledCvor selectedPacijentNode;
	private Pacijent selectedPregledNode;
	
	
	public CellEditor(JTree tree,DefaultTreeCellRenderer renderer){
		super(tree,renderer);
	}
	
	public CellEditor(JTree tree, DefaultTreeCellRenderer renderer, TreeCellEditor editor){
		super(tree,renderer,editor);
	}
	public Component getTreeCellEditorComponent(JTree tree, Object value, boolean isSelected, boolean expanded, boolean leaf, int row){
		DefaultMutableTreeNode sel=(DefaultMutableTreeNode) MainFrame.getInstance().getTree().getSelectionPath().getLastPathComponent();
	
		if(sel.getUserObject() instanceof PacijentCvor){
			this.selectedKartonNode=(PacijentCvor)sel.getUserObject();
		}else if(sel.getUserObject() instanceof PregledCvor){
			this.selectedPacijentNode=(PregledCvor)sel.getUserObject();
		}else if(sel.getUserObject() instanceof Pacijent){
			this.selectedPregledNode=(Pacijent)sel.getUserObject();
		}
		
		return super.getTreeCellEditorComponent(tree, value, isSelected, expanded, leaf, row);
	}
	
	public Object getCellEditorValue(){
		String newName=(String) super.getCellEditorValue();
		DefaultMutableTreeNode sel=(DefaultMutableTreeNode) MainFrame.getInstance().getTree().getSelectionPath().getLastPathComponent();
		
		if(sel.getUserObject() instanceof PacijentCvor){
			this.selectedKartonNode.setIme((String)newName);
		}else if(sel.getUserObject() instanceof PregledCvor){
			this.selectedPacijentNode.setName((String)newName);
		}
		return sel.getUserObject();
	}
	
	public boolean stopCellEditing(){
		return false;
	}

}
