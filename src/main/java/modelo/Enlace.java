package modelo;

public class Enlace {

	protected int id;
	protected int bandwidth;

	public Enlace(int id, int bandwidth) {
		this.id = id;
		this.bandwidth = bandwidth;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}
	
	
}
