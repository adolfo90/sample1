package modelo;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

	private List<Red> substrates;

	public Simulator() {
		substrates = new ArrayList<Red>();

	}

	public List<Red> getSubstrates() {
		return substrates;
	}

	public void setSubstrates(List<Red> substrates) {
		this.substrates = substrates;
	}

	public void addSubstrate(Red s) {
		this.substrates.add(s);
	}


}
