package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

import javax.swing.AbstractAction;
import javax.swing.JPopupMenu;

import edu.uci.ics.jung.algorithms.layout.GraphElementAccessor;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.AbstractPopupGraphMousePlugin;

public class MyEditingPopupGraphMousePlugin<V, E> extends
		AbstractPopupGraphMousePlugin {

	protected JPopupMenu popup = new JPopupMenu();

	@Override
	protected void handlePopup(MouseEvent e) {

		final VisualizationViewer<V, E> vv = (VisualizationViewer<V, E>) e
				.getSource();
		final Layout<V, E> layout = vv.getGraphLayout();
		final Graph<V, E> graph = layout.getGraph();
		final Point2D p = e.getPoint();
        final Point2D ivp = p;

		GraphElementAccessor<V, E> pickSupport = vv.getPickSupport();

		final V vertex = pickSupport.getVertex(layout, ivp.getX(), ivp.getY());
		final E edge = pickSupport.getEdge(layout, ivp.getX(), ivp.getY());
		
		popup.add(new AbstractAction("Create Vertexxxx") {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
		
		
		if(popup.getComponentCount() > 0) {
            popup.show(vv, e.getX(), e.getY());
        }
	}

}
