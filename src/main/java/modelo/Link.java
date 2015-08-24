package modelo;

public class Link {

	protected int id;
	protected int bandwidth;

	public Link(int id, int bandwidth) {
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
