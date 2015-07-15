package modelo;

import edu.uci.ics.jung.graph.Graph;

public class Network {

	protected String id;
	protected Graph<Node, Link> graph;

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

}
