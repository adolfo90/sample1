package modelo;

import java.util.ArrayList;
import java.util.List;

public class Simulator {

	private List<Substrate> substrates;

	public Simulator() {
		substrates = new ArrayList<Substrate>();

	}

	public List<Substrate> getSubstrates() {
		return substrates;
	}

	public void setSubstrates(List<Substrate> substrates) {
		this.substrates = substrates;
	}

	public void addSubstrate(Substrate s) {
		this.substrates.add(s);
	}


}
