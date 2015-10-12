package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

import modelo.Link;
import modelo.Network;
import modelo.Node;
import modelo.Simulador;
import modelo.SubstratoPruebaBase;
import edu.uci.ics.jung.algorithms.layout.FRLayout2;
import edu.uci.ics.jung.algorithms.layout.Layout;

public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8227299073880422539L;
	private JPanel simulatorContentPane;
	private JSplitPane simulatorSplitPane;
	private JTabbedPane graphViewerTabbedPane;
	private JTabbedPane simulatorTabbedPane;
	private JScrollPane algorithmsScrollPane;
	private JScrollPane requestsScrollPane;
	private JScrollPane substratesScrollPane;
	private JTable substratesTable;
	private SubstratesTableModel substratesTableModel;
	private JToolBar simulatorToolBar;
	private Visor graphViewerPanel;

	private Simulador simulator;

	public App() {

		simulator = new Simulador();
		// simulator.addSubstrate(DefaultSubstrates.constructDefault("Red1"));
		simulator.addSubstrate(SubstratoPruebaBase
				.construirSubstrato("RedPrueba"));
		this.setSize(1200, 700);
		this.setTitle("Simulador de Redes");
		this.setLocationRelativeTo(null);
		this.setContentPane(getSimulatorContentPane());

	}

	private JPanel getSimulatorContentPane() {
		if (simulatorContentPane == null) {
			simulatorContentPane = new JPanel();
			simulatorContentPane.setLayout(new BorderLayout());
			simulatorContentPane.add(getSimulatorToolBar(), BorderLayout.NORTH);
			simulatorContentPane.add(getSimulatorSplitPane(),
					BorderLayout.CENTER);
		}
		return simulatorContentPane;
	}

	private JToolBar getSimulatorToolBar() {
		if (simulatorToolBar == null) {
			simulatorToolBar = new JToolBar();

		}
		return simulatorToolBar;
	}

	private JSplitPane getSimulatorSplitPane() {
		if (simulatorSplitPane == null) {
			simulatorSplitPane = new JSplitPane();
			simulatorSplitPane.setRightComponent(getGraphViewerTabbedPane());
			simulatorSplitPane.setLeftComponent(getSimulatorTabbedPane());
		}
		return simulatorSplitPane;
	}

	private JTabbedPane getGraphViewerTabbedPane() {
		if (graphViewerTabbedPane == null) {
			graphViewerTabbedPane = new JTabbedPane();
			graphViewerTabbedPane.setTabPlacement(JTabbedPane.TOP);
		}
		return graphViewerTabbedPane;
	}

	private JTabbedPane getSimulatorTabbedPane() {
		if (simulatorTabbedPane == null) {
			simulatorTabbedPane = new JTabbedPane();
			simulatorTabbedPane.setTabPlacement(JTabbedPane.TOP);
			simulatorTabbedPane.setPreferredSize(new Dimension(280, 0));
			simulatorTabbedPane.addTab("Redes", null,
					getSubstratesScrollPane(), null);
			simulatorTabbedPane.addTab("Peticiones", null,
					getRequestsScrollPane(), null);
			// simulatorTabbedPane.addTab("Algoritmos", null,
			// getAlgorithmsScrollPane(), null);
		}
		return simulatorTabbedPane;
	}

	private JScrollPane getAlgorithmsScrollPane() {
		if (algorithmsScrollPane == null) {
			algorithmsScrollPane = new JScrollPane();
			// algorithmsScrollPane.setViewportView(getAlgorithmsTable());
		}
		return algorithmsScrollPane;
	}

	private JScrollPane getSubstratesScrollPane() {
		if (substratesScrollPane == null) {
			substratesScrollPane = new JScrollPane();
			substratesScrollPane.setName("");
			substratesScrollPane.setViewportView(getSubstratesTable());
		}
		return substratesScrollPane;
	}

	private JScrollPane getRequestsScrollPane() {
		if (requestsScrollPane == null) {
			requestsScrollPane = new JScrollPane();
			// requestsScrollPane.setViewportView(getRequestsTable());
		}
		return requestsScrollPane;
	}

	private JTable getSubstratesTable() {
		if (substratesTable == null) {
			String col[] = { "Nombre", "Nodos", "Enlaces" };
			substratesTableModel = new SubstratesTableModel(col, 0);
			for (Network s : simulator.getSubstrates()) {
				substratesTableModel.addRow(new Object[] { s.getId(),
						s.getGraph().getVertexCount(),
						s.getGraph().getEdgeCount() });
			}
			substratesTable = new JTable(substratesTableModel);

			substratesTable.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2) {
						JTable target = (JTable) e.getSource();
						int row = target.getSelectedRow();
						Network s = simulator.getSubstrates().get(row);

						int index = graphViewerTabbedPane.indexOfTab(s.getId());
						if (index == -1) {

							Visor gv = getGraphViewerPanel(s);
							JPanel pane = new JPanel(new BorderLayout());
							JMenuBar menuBar = new JMenuBar();
							JMenu modeMenu = gv.getGm().getModeMenu();
							modeMenu.setText("Modo");
					        modeMenu.setPreferredSize(new Dimension(90,25)); // Change the size so I can see the text
					        menuBar.add(modeMenu);
							pane.add(gv, BorderLayout.CENTER);
							pane.add(menuBar, BorderLayout.SOUTH);
							graphViewerTabbedPane.addTab(s.getId(), null, pane,
									null);
							graphViewerTabbedPane.setSelectedComponent(pane);

						} else {
							graphViewerTabbedPane.setSelectedIndex(index);
						}

					}
				}
			});

		}
		return substratesTable;
	}

	private Visor getGraphViewerPanel(Network net) {

		Layout<Node, Link> layout = new FRLayout2<Node, Link>(net.getGraph());
		graphViewerPanel = new Visor(layout, net.getNodeFactory(),
				net.getLinkFactory());
		graphViewerPanel.setBackground(Color.WHITE);

		return graphViewerPanel;
	}
}
