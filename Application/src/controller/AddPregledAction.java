package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

import app.MainFrame;


public class AddPregledAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	//	MainFrame.getInstance().setBolest(new Bolest());

		DefaultMutableTreeNode element = (DefaultMutableTreeNode) MainFrame.getInstance().getTree()
				.getLastSelectedPathComponent();

		if (element == null)
		{
			JOptionPane.showMessageDialog(MainFrame.getInstance(), "Izaberite pacijenta!", "Greska!",
					JOptionPane.WARNING_MESSAGE);
			return;
		}
		Object o = element.getUserObject();

	/*	if (o instanceof Pacijent)
		{
			MainFrame.getInstance().getPp1().setPac((Pacijent) o);
		}
		else if (o instanceof Pregled)
		{

			DefaultMutableTreeNode parent = (DefaultMutableTreeNode) element.getParent();

			MainFrame.getInstance().getPp1().setPac((Pacijent) parent.getUserObject());
		}
		else
		{
			JOptionPane.showMessageDialog(MainFrame.getInstance(), "Izaberite pacijenta!", "Greska!",
					JOptionPane.WARNING_MESSAGE);
			return;
		}*/

		// TODO Auto-generated method stub
	/*	MainFrame.getInstance().setRegime(Regime.RBR);

		MainFrame.getInstance().getPp1().ocistiMe();
		MainFrame.getInstance().getPp2().ocistiMe();

		MainFrame.getInstance().getPp1().setText(MainFrame.getInstance().getPp1().getText()
				.replace("[ime mentola]", MainFrame.getInstance().getPp1().getPac().toString()));

		ArrayList<String> njaa = MainFrame.getInstance().getuIbZ().vratiSimptome();
		MainFrame.getInstance().getPp1().ubaciSimptome(njaa);

		MainFrame.getInstance().getPanel().removeAll();

		MainFrame.getInstance().getPanel().add(MainFrame.getInstance().getPp1());
		MainFrame.getInstance().getRightPanel().revalidate();
		MainFrame.getInstance().getRightPanel().repaint();
		MainFrame.getInstance().getDalje().setVisible(true);
		MainFrame.getInstance().getNazad().setVisible(true);

		MainFrame.getInstance().getPanel().revalidate();
		MainFrame.getInstance().getPanel().repaint();
	*/	
	}

}
