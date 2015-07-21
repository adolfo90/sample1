package modelo;

import org.apache.commons.collections15.Factory;

import edu.uci.ics.jung.graph.Graph;

public class Network {

	protected String id;
	protected Graph<Node, Link> graph;
	protected Factory nodeFactory;
	protected Factory linkFactory;

	public Network(String id) {
		this.id = id;
		graph = new NetworkGraph();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Graph<Node, Link> getGraph() {
		return graph;
	}

	public void setGraph(Graph<Node, Link> graph) {
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
