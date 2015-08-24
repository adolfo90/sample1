package modelo;

public class NodoDataCenter extends Node {

	private int cpu;
	private int memoria;
	private int almacenamiento;
	
	public NodoDataCenter(int id) {
		super(id);
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	
	
}
