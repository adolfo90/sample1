package interfaz;

import modelo.Link;
import modelo.Node;

import org.apache.commons.collections15.Factory;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.visualization.VisualizationViewer;

public class GraphViewerPanel extends VisualizationViewer<Node, Link> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5488555157025697692L;

	public GraphViewerPanel(Layout<Node, Link> layout, Factory nodeFactory,
			Factory linkFactory) {
		super(layout);
		
		
		
		// TODO Auto-generated constructor stub
	}

}
