package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import modelo.DefaultSubstrates;
import modelo.Simulator;
import modelo.Substrate;

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

	private Simulator simulator;

	public App() {

		simulator = new Simulator();
		simulator.addSubstrate(DefaultSubstrates
				.constructDefaultSubstrate("Red1"));
		simulator.addSubstrate(DefaultSubstrates
				.constructDefaultSubstrate("Red2"));

		this.setSize(1100, 600);
		this.setTitle("Simulador");
		this.setLocationRelativeTo(null);
		this.setContentPane(getSimulatorContentPane());

	}

	private JPanel getSimulatorContentPane() {
		if (simulatorContentPane == null) {
			simulatorContentPane = new JPanel();
			simulatorContentPane.setLayout(new BorderLayout());
			simulatorContentPane.add(getSimulatorSplitPane(),
					BorderLayout.CENTER);
		}
		return simulatorContentPane;
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
			graphViewerTabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
		}
		return graphViewerTabbedPane;
	}

	private JTabbedPane getSimulatorTabbedPane() {
		if (simulatorTabbedPane == null) {
			simulatorTabbedPane = new JTabbedPane();
			simulatorTabbedPane.setTabPlacement(JTabbedPane.TOP);
			simulatorTabbedPane.setPreferredSize(new Dimension(280, 0));
			simulatorTabbedPane.addTab("Peticiones", null,
					getRequestsScrollPane(), null);
			simulatorTabbedPane.addTab("Redes", null,
					getSubstratesScrollPane(), null);
			simulatorTabbedPane.addTab("Algoritmos", null,
					getAlgorithmsScrollPane(), null);
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
			String col[] = { "Nombre" };
			substratesTableModel = new SubstratesTableModel(col, 0);
			for (Substrate s : simulator.getSubstrates()) {
				substratesTableModel.addRow(new Object[] { s.getId() });
			}
			substratesTable = new JTable(substratesTableModel);

			substratesTable.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 1) {
						JTable target = (JTable) e.getSource();
						int row = target.getSelectedRow();
						System.out.println("\n" + simulator.getSubstrates().get(row).getId());

					}
				}
			});

		}
		return substratesTable;
	}
}
