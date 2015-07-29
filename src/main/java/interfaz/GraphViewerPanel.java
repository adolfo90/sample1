package interfaz;

import javax.swing.Icon;

import modelo.Link;
import modelo.Node;

import org.apache.commons.collections15.Factory;
import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.EditingModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.PickableVertexIconTransformer;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

public class GraphViewerPanel extends VisualizationViewer<Node, Link> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5488555157025697692L;
	
	EditingModalGraphMouse gm;

	public GraphViewerPanel(Layout<Node, Link> layout, Factory nodeFactory,
			Factory linkFactory) {
		super(layout);
		
		// Setup up icons for nodes
				PickableVertexIconTransformer<Node> vertexIcon = new PickableVertexIconTransformer<Node>(getPickedVertexState(), null, null) {
					public Icon transform(Node n) {						
							return n.getIcon();						
					}
		        };
		        this.getRenderContext().setVertexIconTransformer(vertexIcon);
		        
		        Transformer<Node, String> vertexLabel = new Transformer<Node, String>() {
					public String transform(Node n) {
						return "" + n.getId();
					}
		        };
		        this.getRenderContext().setVertexLabelTransformer(vertexLabel);
		        this.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
		        
		        this.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line());
		
		// TODO Auto-generated constructor stub
	}

}
