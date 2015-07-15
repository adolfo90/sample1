package modelo;

import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class DefaultSubstrates {

	public static final Substrate constructDefaultSubstrate(String id) {

		Substrate substrate = new Substrate(id);

		SubstrateRouter nodo1 = new SubstrateRouter(1);

		SubstrateServer nodo2 = new SubstrateServer(2);
		
		SubstrateLink enlace1 = new SubstrateLink(0,100);
		
		substrate.getGraph().addEdge(enlace1, new Pair<Node>(nodo1, nodo2), EdgeType.UNDIRECTED);
		
		
		

		return substrate;
	}

}
