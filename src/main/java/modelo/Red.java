package modelo;

import org.apache.commons.collections15.Factory;

import edu.uci.ics.jung.graph.Graph;

public class Red {

	protected String id;
	protected Graph<Node, Enlace> graph;
	protected Factory nodeFactory;
	protected Factory linkFactory;

	public Red(String id) {
		this.id = id;
		graph = new NetworkGraph();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Graph<Node, Enlace> getGraph() {
		return graph;
	}

	public void setGraph(Graph<Node, Enlace> graph) {
		this.graph = graph;
	}

	public Factory getNodeFactory() {
		return nodeFactory;
	}

	public void setNodeFactory(Factory nodeFactory) {
		this.nodeFactory = nodeFactory;
	}

	public Factory getLinkFactory() {
		return linkFactory;
	}

	public void setLinkFactory(Factory linkFactory) {
		this.linkFactory = linkFactory;
	}
	
	

}
