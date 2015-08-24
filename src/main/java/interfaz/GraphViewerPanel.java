package interfaz;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import modelo.Link;
import modelo.Node;
import modelo.NodoDataCenter;

import org.apache.commons.collections15.Factory;
import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.EditingModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

public class GraphViewerPanel extends VisualizationViewer<Node, Link> {

	private static final long serialVersionUID = -5488555157025697692L;

	EditingModalGraphMouse<Node, Link> gm;

	public GraphViewerPanel(Layout<Node, Link> layout,
			Factory<Node> nodeFactory, Factory<Link> linkFactory) {
		super(layout);

		// Setup up icons for nodes
		/*
		 * PickableVertexIconTransformer<Node> vertexIcon = new
		 * PickableVertexIconTransformer<Node>(getPickedVertexState(), null,
		 * null) { public Icon transform(Node n) {
		 * 
		 * if (n instanceof SubstrateServer){ return Icons.SERVER; }else{ return
		 * Icons.ROUTER; }
		 * 
		 * } };
		 */
		// this.getRenderContext().setVertexIconTransformer(vertexIcon);

		Transformer<Node, String> vertexLabel = new Transformer<Node, String>() {
			public String transform(Node n) {
				
				if (n instanceof NodoDataCenter) {
					NodoDataCenter nd = (NodoDataCenter) n;
					return "" + n.getId() + "cpu " + nd.getCpu();
				} else {
					return "" + n.getId();
				}
				
				
			}
		};

		Transformer<Node, Paint> vertexPaint = new Transformer<Node, Paint>() {
			public Paint transform(Node n) {
				if (n instanceof NodoDataCenter) {
					return Color.LIGHT_GRAY;
				} else {
					return Color.ORANGE;
				}
			}
		};
		Transformer<Node, Shape> vertexShape = new Transformer<Node, Shape>() {
			public Shape transform(Node n) {
				if (n instanceof NodoDataCenter) {
					return new Rectangle(-20, -13, 40, 26);
				} else {
					return new Ellipse2D.Double(-13, -13, 26, 26);
				}
			}
		};

		this.getRenderContext().setVertexLabelTransformer(vertexLabel);
		this.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
		this.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
		this.getRenderContext().setVertexShapeTransformer(vertexShape);

		this.getRenderContext().setEdgeShapeTransformer(
				new EdgeShape.Line<Node, Link>());

		Transformer<Link, String> linkLabel = new Transformer<Link, String>() {
			public String transform(Link l) {
				return "" + l.getBandwidth();
			}
		};
		this.getRenderContext().setEdgeLabelTransformer(linkLabel);

		gm = new EditingModalGraphMouse<Node, Link>(this.getRenderContext(),
				nodeFactory, linkFactory);
		gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
		gm.remove(gm.getPopupEditingPlugin());
		this.setGraphMouse(gm);

	}

}
