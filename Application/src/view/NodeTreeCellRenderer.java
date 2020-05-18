package view;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;



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
		
		
		return this;
	}
	

}

