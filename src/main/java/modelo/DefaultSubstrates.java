package modelo;

import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class DefaultSubstrates {

	public static final Substrate constructDefaultSubstrate(String id) {

		Substrate substrate = new Substrate(id);

		SubstrateServer nodo1 = new SubstrateServer(81);

		SubstrateRouter nodo2 = new SubstrateRouter(82);
		
		SubstrateRouter nodo3 = new SubstrateRouter(83);
		
		SubstrateRouter nodo4 = new SubstrateRouter(84);
		
		SubstrateRouter nodo5 = new SubstrateRouter(55);
		
		SubstrateRouter nodo6 = new SubstrateRouter(6);
		
		SubstrateRouter nodo7 = new SubstrateRouter(7);
		
		SubstrateRouter nodo8 = new SubstrateRouter(8);
		
		SubstrateRouter nodo10 = new SubstrateRouter(10);
		
		SubstrateServer nodo9 = new SubstrateServer(59);
		
		SubstrateLink enlace1 = new SubstrateLink(0,100);
		SubstrateLink enlace2 = new SubstrateLink(0,100);
		SubstrateLink enlace3 = new SubstrateLink(0,100);
		SubstrateLink enlace4 = new SubstrateLink(0,100);
		SubstrateLink enlace5 = new SubstrateLink(0,100);
		SubstrateLink enlace6 = new SubstrateLink(0,100);
		SubstrateLink enlace7 = new SubstrateLink(0,100);
		SubstrateLink enlace8 = new SubstrateLink(0,100);
		SubstrateLink enlace9 = new SubstrateLink(0,100);
		SubstrateLink enlace10 = new SubstrateLink(0,100);
		SubstrateLink enlace11 = new SubstrateLink(0,100);		
		
		substrate.getGraph().addEdge(enlace1, new Pair<Node>(nodo1, nodo2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace8, new Pair<Node>(nodo3, nodo6), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace2, new Pair<Node>(nodo7, nodo4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace3, new Pair<Node>(nodo3, nodo2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace4, new Pair<Node>(nodo5, nodo4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace5, new Pair<Node>(nodo6, nodo8), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace6, new Pair<Node>(nodo9, nodo4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace7, new Pair<Node>(nodo8, nodo2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace9, new Pair<Node>(nodo8, nodo5), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace10, new Pair<Node>(nodo8, nodo7), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace11, new Pair<Node>(nodo8, nodo10), EdgeType.UNDIRECTED);
		

		return substrate;
	}

}
