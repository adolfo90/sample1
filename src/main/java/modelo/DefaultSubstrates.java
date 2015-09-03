package modelo;

import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class DefaultSubstrates {

	public static final Network constructDefault(String nombre) {

		Network substrate = new Network(nombre);

		NodoDataCenter nodo1 = new NodoDataCenter(81);
		nodo1.setCpu(3);
		nodo1.setAlmacenamiento(5);
		nodo1.setMemoria(2);

		NodoIntermedio nodo2 = new NodoIntermedio(82);
		
		NodoIntermedio nodo3 = new NodoIntermedio(83);
		
		NodoIntermedio nodo4 = new NodoIntermedio(84);
		
		NodoIntermedio nodo5 = new NodoIntermedio(55);
		
		NodoIntermedio nodo6 = new NodoIntermedio(6);
		
		NodoIntermedio nodo7 = new NodoIntermedio(7);
		
		NodoIntermedio nodo8 = new NodoIntermedio(8);
		
		
		NodoDataCenter nodo9 = new NodoDataCenter(59);
		nodo9.setCpu(3);
		nodo9.setAlmacenamiento(5);
		nodo9.setMemoria(2);

		
		Link enlace1 = new Link(2,100);
		Link enlace2 = new Link(3,100);
		Link enlace3 = new Link(4,400);
		Link enlace4 = new Link(5,100);
		Link enlace5 = new Link(6,200);
		Link enlace6 = new Link(7,100);
		Link enlace7 = new Link(8,100);
		Link enlace8 = new Link(9,300);
		Link enlace9 = new Link(10,100);
		Link enlace10 = new Link(20,100);
		
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
