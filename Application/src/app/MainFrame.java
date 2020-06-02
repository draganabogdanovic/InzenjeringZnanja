package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

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

import model.Workspace;
import view.CellEditor;
import view.NodeTreeCellRenderer;
import view.NoviPacijent;


public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainFrame instance = new MainFrame();
	private JTree tree;
	private DefaultTreeModel modelTree;
//	private JPanel showViewProduct1 = new JPanel();
//	private JPanel showViewParameter1 = new JPanel();
	private Workspace root;
	private JPanel showView = new JPanel();
	private NoviPacijent noviPacijent;
	
	private MainFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screeWidth = screenSize.width;
		setSize(screeWidth / 2, screenHeight / 2);
		setTitle("MyApp");
		Image img = kit.getImage("img/movie.png");
		setIconImage(img);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		MenuBar mb = new MenuBar(this);
		setJMenuBar(mb);

		ToolBar tool = new ToolBar();
		add(tool, BorderLayout.NORTH);

		JLabel label = new JLabel("Welcome!");
		add(label, BorderLayout.SOUTH);

		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.LIGHT_GRAY);
		leftPanel.setPreferredSize(new Dimension(300, 300));
		leftPanel.setMinimumSize(new Dimension(200, 200));
		initTree();
		JScrollPane scrollPane = new JScrollPane(tree,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.WHITE);
		rightPanel.setPreferredSize(new Dimension(300, 300));
		
		

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				scrollPane, showView);
		splitPane.setOneTouchExpandable(true);
		splitPane.setContinuousLayout(true);

		add(splitPane, BorderLayout.CENTER);

		leftPanel.setMinimumSize(new Dimension(200, 200));

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

			@Override
			public void valueChanged(TreeSelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			
		});

		KeyStroke ks = KeyStroke.getKeyStroke("F2");
		InputMap im = tree
				.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		im.put(ks, "edit_tree_cell");
		ActionMap am = tree.getActionMap();
		am.put("edit_tree_cell", new AbstractAction() {
			
			private static final long serialVersionUID = -6269711710164054911L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				tree.startEditingAtPath(tree.getSelectionPath());

			}
		});

	}

	public NoviPacijent getNoviPacijent() {
		return noviPacijent;
	}

	public void setNoviPacijent(NoviPacijent noviPacijent) {
		this.noviPacijent = noviPacijent;
	}

	
	
	
}

