package modelo;

import java.util.ArrayList;
import java.util.List;

public class Simulador {

	private List<Network> substrates;

	public Simulador() {
		substrates = new ArrayList<Network>();

	}

	public List<Network> getSubstrates() {
		return substrates;
	}

	public void setSubstrates(List<Network> substrates) {
		this.substrates = substrates;
	}

	public void addSubstrate(Network s) {
		this.substrates.add(s);
	}


}
