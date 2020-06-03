package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.tree.DefaultMutableTreeNode;

import app.MainFrame;
import model.Karton;
import model.Pacijent;
import view.NoviPacijent;


public class DodajPacijenta implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
			NoviPacijent np = new NoviPacijent();
			
			DefaultMutableTreeNode element = (DefaultMutableTreeNode) MainFrame.getInstance().getTreeModel()
					.getRoot();

			Pacijent noviPac = new Pacijent(np.getName(), np.getSurname());

			MainFrame.getInstance().getTreeModel().insertNodeInto(new DefaultMutableTreeNode(noviPac), element,
					element.getChildCount());

			Karton.getInstance().dodajPacijenta(noviPac);

			np.dispose();
	}
}


