package modelo;

import org.apache.commons.collections15.Factory;

public class Network {

	protected String id;
	protected NetworkGraph graph;
	protected Factory<Node> nodeFactory;
	protected Factory<Link> linkFactory;

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

	public NetworkGraph getGraph() {
		return graph;
	}

	public void setGraph(NetworkGraph graph) {
		this.graph = graph;
	}

	public Factory<Node> getNodeFactory() {
		return nodeFactory;
	}

	public void setNodeFactory(Factory<Node> nodeFactory) {
		this.nodeFactory = nodeFactory;
	}

	public Factory<Link> getLinkFactory() {
		return linkFactory;
	}

	public void setLinkFactory(Factory<Link> linkFactory) {
		this.linkFactory = linkFactory;
	}

}
