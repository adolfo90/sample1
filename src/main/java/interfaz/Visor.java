package interfaz;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import modelo.Link;
import modelo.Node;
import modelo.NodoDataCenter;

import org.apache.commons.collections15.Factory;
import org.apache.commons.collections15.Transformer;
import org.apache.commons.collections15.functors.ConstantTransformer;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.EditingModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.PickableEdgePaintTransformer;
import edu.uci.ics.jung.visualization.decorators.PickableVertexPaintTransformer;
import edu.uci.ics.jung.visualization.renderers.Renderer.VertexLabel.Position;

public class Visor extends VisualizationViewer<Node, Link> {

	private static final long serialVersionUID = -5488555157025697692L;

	EditingModalGraphMouse<Node, Link> gm;

	MyEditingPopupGraphMousePlugin<Node, Link> mousePlugin;

	public Visor(Layout<Node, Link> layout, Factory<Node> nodeFactory,
			Factory<Link> linkFactory) {
		super(layout);

		Transformer<Node, String> vertexLabel = new Transformer<Node, String>() {
			public String transform(Node n) {

				return "" + n.getId();

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
					return new Ellipse2D.Double(-22, -22, 44, 44);
				} else {
					return new Ellipse2D.Double(-13, -13, 26, 26);
				}
			}
		};

		// this.getRenderContext().setVertexLabelTransformer(vertexLabel);
		this.getRenderer().getVertexLabelRenderer().setPosition(Position.CNTR);
		this.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
		this.getRenderContext().setVertexShapeTransformer(vertexShape);

		// DefaultVertexLabelRenderer vertexLabelRenderer=new
		// DefaultVertexLabelRenderer(Color.RED);

		this.getRenderContext().setEdgeShapeTransformer(
				new EdgeShape.Line<Node, Link>());

		Transformer<Link, String> linkLabel = new Transformer<Link, String>() {
			public String transform(Link l) {
				return "" + l.getId();
			}
		};
		// this.getRenderContext().setEdgeLabelTransformer(linkLabel);
		this.getRenderContext().setEdgeDrawPaintTransformer(
				new PickableEdgePaintTransformer(getPickedEdgeState(),
						Color.black, Color.red));
		this.getRenderContext().setVertexDrawPaintTransformer(
				new PickableVertexPaintTransformer(getPickedVertexState(),
						Color.black, Color.red));

		this.getRenderContext().setEdgeStrokeTransformer(
				new ConstantTransformer(new BasicStroke(1.8f)));
		this.getRenderContext().setVertexStrokeTransformer(
				new ConstantTransformer(new BasicStroke(1.8f)));

		gm = new EditingModalGraphMouse<Node, Link>(this.getRenderContext(),
				nodeFactory, linkFactory);
		gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);

		mousePlugin = new MyEditingPopupGraphMousePlugin<>();

		gm.remove(gm.getPopupEditingPlugin());
		gm.add(mousePlugin);
		this.setGraphMouse(gm);

	}

	public EditingModalGraphMouse getGm() {
		return gm;
	}

	public void setGm(EditingModalGraphMouse gm) {
		this.gm = gm;
	}

}
