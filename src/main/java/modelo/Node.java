package modelo;

import javax.swing.Icon;

public class Node {

	protected int id;
	protected Icon icon;

	public Node(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	
}
