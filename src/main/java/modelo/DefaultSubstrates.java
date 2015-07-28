package modelo;

import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class DefaultSubstrates {

	public static final Substrate constructDefaultSubstrate(String id) {

		Substrate substrate = new Substrate(id);

		SubstrateServer nodo1 = new SubstrateServer(1);

		SubstrateRouter nodo2 = new SubstrateRouter(2);
		
		SubstrateRouter nodo3 = new SubstrateRouter(2);
		
		SubstrateRouter nodo4 = new SubstrateRouter(2);
		
		SubstrateRouter nodo5 = new SubstrateRouter(2);
		
		SubstrateRouter nodo6 = new SubstrateRouter(2);
		
		SubstrateRouter nodo7 = new SubstrateRouter(2);
		
		SubstrateRouter nodo8 = new SubstrateRouter(2);
		
		SubstrateRouter nodo9 = new SubstrateRouter(2);
		
		SubstrateLink enlace1 = new SubstrateLink(0,100);
		SubstrateLink enlace2 = new SubstrateLink(0,100);
		SubstrateLink enlace3 = new SubstrateLink(0,100);
		SubstrateLink enlace4 = new SubstrateLink(0,100);
		SubstrateLink enlace5 = new SubstrateLink(0,100);
		SubstrateLink enlace6 = new SubstrateLink(0,100);
		SubstrateLink enlace7 = new SubstrateLink(0,100);
		SubstrateLink enlace8 = new SubstrateLink(0,100);
		SubstrateLink enlace9 = new SubstrateLink(0,100);
		
		substrate.getGraph().addEdge(enlace1, new Pair<Node>(nodo1, nodo2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace8, new Pair<Node>(nodo3, nodo5), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace2, new Pair<Node>(nodo7, nodo4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace3, new Pair<Node>(nodo3, nodo2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace4, new Pair<Node>(nodo5, nodo4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace5, new Pair<Node>(nodo6, nodo5), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace6, new Pair<Node>(nodo9, nodo4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace7, new Pair<Node>(nodo8, nodo4), EdgeType.UNDIRECTED);
		
		

		return substrate;
	}

}
