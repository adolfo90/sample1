package modelo;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class SubstratoPruebaBase {
	public static final Network construirSubstrato(String nombre) {
		
		Network substrate = new Network(nombre);
		
		//Nodos intermedios (ROUTERS)
		NodoIntermedio nodoRouter1 = new NodoIntermedio(1);
		NodoIntermedio nodoRouter2 = new NodoIntermedio(2);
		NodoIntermedio nodoRouter3 = new NodoIntermedio(3);
		NodoIntermedio nodoRouter4 = new NodoIntermedio(4);
		NodoIntermedio nodoRouter5 = new NodoIntermedio(5);
		NodoIntermedio nodoRouter6 = new NodoIntermedio(6);
		
		//Nodos DataCenter

		NodoDataCenter nodoDC1 = new NodoDataCenter(101);
		nodoDC1.setCpu(10);
		nodoDC1.setAlmacenamiento(200);
		nodoDC1.setMemoria(30);
		
		NodoDataCenter nodoDC2 = new NodoDataCenter(102);
		nodoDC2.setCpu(5);
		nodoDC2.setAlmacenamiento(400);
		nodoDC2.setMemoria(10);
		
		NodoDataCenter nodoDC3 = new NodoDataCenter(103);
		nodoDC3.setCpu(8);
		nodoDC3.setAlmacenamiento(50);
		nodoDC3.setMemoria(20);
		
		NodoDataCenter nodoDC4 = new NodoDataCenter(104);
		nodoDC4.setCpu(2);
		nodoDC4.setAlmacenamiento(100);
		nodoDC4.setMemoria(15);
		
		NodoDataCenter nodoDC5 = new NodoDataCenter(105);
		nodoDC5.setCpu(5);
		nodoDC5.setAlmacenamiento(500);
		nodoDC5.setMemoria(50);
		
		NodoDataCenter nodoDC6 = new NodoDataCenter(106);
		nodoDC6.setCpu(2);
		nodoDC6.setAlmacenamiento(600);
		nodoDC6.setMemoria(8);
		
		Link enlace11 = new Link(11,100);
		Link enlace12 = new Link(12,100);
		Link enlace14 = new Link(14,400);
		Link enlace22 = new Link(22,100);
		Link enlace23 = new Link(23,200);
		Link enlace25= new Link(25,100);
		Link enlace33= new Link(33,100);
		Link enlace36= new Link(36,300);
		Link enlace44= new Link(44,100);
		Link enlace45 = new Link(45,100);
		Link enlace55 = new Link(55,100);
		Link enlace56 = new Link(56,100);
		Link enlace66 = new Link(66,100);
		
		substrate.getGraph().addEdge(enlace11, new Pair<Node>(nodoDC1, nodoRouter1), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace12, new Pair<Node>(nodoRouter1, nodoRouter2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace14, new Pair<Node>(nodoRouter1, nodoRouter4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace22, new Pair<Node>(nodoDC2, nodoRouter2), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace23, new Pair<Node>(nodoRouter2, nodoRouter3), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace25, new Pair<Node>(nodoRouter2, nodoRouter5), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace33, new Pair<Node>(nodoDC3, nodoRouter3), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace36, new Pair<Node>(nodoRouter3, nodoRouter6), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace44, new Pair<Node>(nodoDC4, nodoRouter4), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace45, new Pair<Node>(nodoRouter4, nodoRouter5), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace55, new Pair<Node>(nodoDC5, nodoRouter5), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace56, new Pair<Node>(nodoRouter5, nodoRouter6), EdgeType.UNDIRECTED);
		substrate.getGraph().addEdge(enlace66, new Pair<Node>(nodoDC6, nodoRouter6), EdgeType.UNDIRECTED);
		
 
		
		return substrate;
		
	}
	

}
