package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.Collection;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

import cbr.Baza;
import controller.Close;
import controller.DijalogZaBolesti;
import controller.PostaviDijagnozu;
import controller.PostaviDijagnozuCase;
import controller.PostaviTerapiju;
import controller.PostaviTerapijuCase;
import controller.UcitajIzBaze;
import model.Pacijent;
import model.PacijentCvor;
import model.Pregled;
import model.Rezim;
import model.Workspace;
import ucm.gaia.jcolibri.method.retrieve.RetrievalResult;
import view.CellEditor;
import view.NodeTreeCellRenderer;
import view.NoviCasePregled;
import view.NoviPregled;
import view.PacijentView;


public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainFrame instance = new MainFrame();
	private JTree tree;
	private DefaultTreeModel modelTree;
	
	private JPanel showViewKarton1 = new JPanel();
	private JPanel showViewPacijent1 = new JPanel();
	private JPanel showViewPregled1 = new JPanel();
	
	private Workspace root;
	private JPanel showView = new JPanel();
	private UcitajIzBaze baza;
	private Rezim rezim;
	private JPanel rightPanel;
	private DijalogZaBolesti dijalog;
	private Pregled bolest;
	private NoviPregled noviPregled;
	private NoviCasePregled noviCasePregled;
	private PostaviDijagnozu dijagnoza;
	private PostaviDijagnozuCase dijagnozaCase;
	private PostaviTerapiju postaviTerapiju;
	private Baza bazaCase;
	private Collection<RetrievalResult> ret;
	private PostaviTerapijuCase terapijaCase;
	
	public MainFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screeWidth = screenSize.width;
		setSize(screeWidth / 2, screenHeight / 2);
		setTitle("My app");
		Image img = kit.getImage("img/prvi.png");
		setIconImage(img);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		ToolBar tool = new ToolBar();
		add(tool, BorderLayout.NORTH);

		JLabel label = new JLabel("Status bar");
		add(label, BorderLayout.SOUTH);

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setPreferredSize(new Dimension(300, 300));
		leftPanel.setMinimumSize(new Dimension(200, 200));
		initTree();
		JScrollPane scrollPane = new JScrollPane(tree,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		rightPanel = new JPanel();
		rightPanel.setBackground(Color.WHITE);
		rightPanel.setPreferredSize(new Dimension(300, 300));
		

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				scrollPane, showView);
		splitPane.setOneTouchExpandable(true);
		splitPane.setContinuousLayout(true);

		add(splitPane, BorderLayout.CENTER);

		leftPanel.setMinimumSize(new Dimension(200, 200));
		
		setBaza(new UcitajIzBaze());
		
		addWindowListener(new Close());

	}

	public static MainFrame getInstance() {
		return instance;
	}

	public JTree getTree() {
		return tree;
	}

	public DefaultTreeModel getModel() {
		return modelTree;
	}

	private void initTree() {
		this.root = new Workspace("Kartoni pacijenata", null);
		modelTree = new DefaultTreeModel(new DefaultMutableTreeNode(this.root));
		modelTree.setAsksAllowsChildren(true);
		tree = new JTree(modelTree) {

			private static final long serialVersionUID = 8417403008052533555L;

			public boolean isPathEditable(TreePath path) {
				if (path != null) {
					DefaultMutableTreeNode tn = (DefaultMutableTreeNode) path
							.getLastPathComponent();
					if (!tn.isRoot()) {
						return true;
					} else {
						return false;
					}
				}
				return false;
			}

		};
		tree.setEditable(true);
		tree.setCellEditor(new CellEditor(tree, null));
		tree.setCellRenderer(new NodeTreeCellRenderer());
		tree.getSelectionModel().setSelectionMode(
				TreeSelectionModel.SINGLE_TREE_SELECTION);

		tree.addTreeSelectionListener(new TreeSelectionListener() {

			public void valueChanged(TreeSelectionEvent arg0) {
				if (arg0.getNewLeadSelectionPath() != null) {
					if (((DefaultMutableTreeNode) arg0
							.getNewLeadSelectionPath().getLastPathComponent())
							.getUserObject() instanceof PacijentCvor) {
						PacijentCvor selektovan = (PacijentCvor) ((DefaultMutableTreeNode) arg0
								.getNewLeadSelectionPath()
								.getLastPathComponent()).getUserObject();
						Pacijent karton = selektovan
								.getKarton();
						PacijentView pacijentView = new PacijentView(
								karton);
						showViewKarton1.removeAll();
						showViewPacijent1.setVisible(false);
						showViewPregled1.setVisible(false);
						showViewKarton1.add(pacijentView);
						showViewKarton1.setVisible(true);
						showView.removeAll();
						showView.add(showViewKarton1);
						showView.revalidate();
						showView.repaint();
					} /*else if (((DefaultMutableTreeNode) arg0
							.getNewLeadSelectionPath().getLastPathComponent())
							.getUserObject() instanceof PregledCvor) {
							//if(MainFrame.getInstance().getRezim() == rezim.RBR) {
								PregledCvor selectedNode = (PregledCvor) ((DefaultMutableTreeNode) arg0
										.getNewLeadSelectionPath()
										.getLastPathComponent()).getUserObject();
								PregledPacijenta product = selectedNode.getPregled();
								PregledPacijentaView productView = new PregledPacijentaView(
										product);
		
								showViewKarton1.setVisible(false);
								showViewPregled1.setVisible(false);
		
								showViewPacijent1.removeAll();
								showViewPacijent1.add(productView);
								showViewPacijent1.setVisible(true);
		
								showView.add(showViewPacijent1);
								showView.setVisible(true);
								showView.revalidate();
								showView.repaint();
							} else if (((DefaultMutableTreeNode) arg0
										.getNewLeadSelectionPath().getLastPathComponent())
										.getUserObject() instanceof PacijentCaseCvor) {
									PacijentCaseCvor selektovan = (PacijentCaseCvor) ((DefaultMutableTreeNode) arg0
											.getNewLeadSelectionPath()
											.getLastPathComponent()).getUserObject();
									Pacijent karton = selektovan
											.getKarton();
									PacijentView pacijentView = new PacijentView(
											karton);
									showViewKarton1.removeAll();
									showViewPacijent1.setVisible(false);
									showViewPregled1.setVisible(false);
									showViewKarton1.add(pacijentView);
									showViewKarton1.setVisible(true);
									showView.removeAll();
									showView.add(showViewKarton1);
									showView.revalidate();
									showView.repaint();
								}*
								/*else if (((DefaultMutableTreeNode) arg0
									.getNewLeadSelectionPath().getLastPathComponent())
									.getUserObject() instanceof PregledCaseCvor){
								PregledCaseCvor selectedNode = (PregledCaseCvor) ((DefaultMutableTreeNode) arg0
										.getNewLeadSelectionPath()
										.getLastPathComponent()).getUserObject();
								PregledPacijenta product = selectedNode.getPregled();
								PregledCasePacijentaView productView = new PregledCasePacijentaView(
										product);
		
								showViewKarton1.setVisible(false);
								showViewPregled1.setVisible(false);
		
								showViewPacijent1.removeAll();
								showViewPacijent1.add(productView);
								showViewPacijent1.setVisible(true);
		
								showView.add(showViewPacijent1);
								showView.setVisible(true);
								showView.revalidate();
								showView.repaint();
						}*/
							
					//}
					
				}
			}
			
		});

		KeyStroke ks = KeyStroke.getKeyStroke("F2");
		InputMap im = tree
				.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		im.put(ks, "edit_tree_cell");
		ActionMap am = tree.getActionMap();
		am.put("edit_tree_cell", new AbstractAction() {
			
			private static final long serialVersionUID = -6269711710164054911L;

			public void actionPerformed(ActionEvent arg0) {
				tree.startEditingAtPath(tree.getSelectionPath());

			}
		});

	}

	public Rezim getRezim() {
		return rezim;
	}

	public Rezim setRezim(Rezim rezim) {
		return rezim;
	}

	public UcitajIzBaze getBaza() {
		return baza;
	}

	public void setBaza(UcitajIzBaze baza) {
		this.baza = baza;
	}

	
	public JPanel getRightPanel()
	{
		return rightPanel;
	}

	public void setRightPanel(JPanel rightPanel)
	{
		this.rightPanel = rightPanel;
	}
	
	public Pregled getBolest()
	{
		return bolest;
	}

	public void setBolest(Pregled bolest)
	{
		this.bolest = bolest;
	}

	public DijalogZaBolesti getDijalog() {
		return dijalog;
	}

	public void setDijalog(DijalogZaBolesti dijalog) {
		this.dijalog = dijalog;
	}

	public void setNoviPregled(NoviPregled noviPregled) {
		// TODO Auto-generated method stub
		this.noviPregled = noviPregled;
		
	}
	
	public NoviPregled getNoviPregled() {
		
		return noviPregled;
	}

	public void setNoviCasePregled(NoviCasePregled noviCasePregled) {
		// TODO Auto-generated method stub
		this.noviCasePregled = noviCasePregled;
		
	}
	
	
	public NoviCasePregled getNoviCasePregled() {
		
		return noviCasePregled;
	}

	public PostaviDijagnozu getDijagnoza() {
		return dijagnoza;
	}

	public void setDijagnoza(PostaviDijagnozu dijagnoza) {
		this.dijagnoza = dijagnoza;
	}

	public void setTerapija(PostaviTerapiju postaviTerapiju) {
		// TODO Auto-generated method stub
		this.postaviTerapiju = postaviTerapiju;
	}
	
	public PostaviTerapiju getTerapija() {
		
		return postaviTerapiju;
	}

	public Baza getBazaCase() {
		return bazaCase;
	}

	public void setBazaCase(Baza bazaCase) {
		this.bazaCase = bazaCase;
	}

	public Collection<RetrievalResult> getRet() {
		return ret;
	}

	public void setRet(Collection<RetrievalResult> ret) {
		this.ret = ret;
	}

	public PostaviDijagnozuCase getDijagnozaCase() {
		return dijagnozaCase;
	}

	public void setDijagnozaCase(PostaviDijagnozuCase dijagnozaCase) {
		this.dijagnozaCase = dijagnozaCase;
	}

	public PostaviTerapijuCase getTerapijaCase() {
		return terapijaCase;
	}

	public void setTerapijaCase(PostaviTerapijuCase terapijaCase) {
		this.terapijaCase = terapijaCase;
	}
	
}

