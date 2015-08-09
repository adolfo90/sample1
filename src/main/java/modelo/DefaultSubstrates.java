package modelo;

import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class DefaultSubstrates {

	public static final Red constructDefaultSubstrate(String id) {

		Red substrate = new Red(id);

		NodoDataCenter nodo1 = new NodoDataCenter(81);

		NodoIntermedio nodo2 = new NodoIntermedio(82);
		
		NodoIntermedio nodo3 = new NodoIntermedio(83);
		
		NodoIntermedio nodo4 = new NodoIntermedio(84);
		
		NodoIntermedio nodo5 = new NodoIntermedio(55);
		
		NodoIntermedio nodo6 = new NodoIntermedio(6);
		
		NodoIntermedio nodo7 = new NodoIntermedio(7);
		
		NodoIntermedio nodo8 = new NodoIntermedio(8);
		
		NodoIntermedio nodo10 = new NodoIntermedio(10);
		
		NodoDataCenter nodo9 = new NodoDataCenter(59);
		
		Enlace enlace1 = new Enlace(0,100);
		Enlace enlace2 = new Enlace(0,100);
		Enlace enlace3 = new Enlace(0,400);
		Enlace enlace4 = new Enlace(0,100);
		Enlace enlace5 = new Enlace(0,200);
		Enlace enlace6 = new Enlace(0,100);
		Enlace enlace7 = new Enlace(0,100);
		Enlace enlace8 = new Enlace(0,300);
		Enlace enlace9 = new Enlace(0,100);
		Enlace enlace10 = new Enlace(0,100);
		
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
		

		return substrate;
	}

}
