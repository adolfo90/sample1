package interfaz;

import javax.swing.table.DefaultTableModel;

public class SubstratesTableModel extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2318782893014810739L;

	public SubstratesTableModel(String[] col, int i) {
		super(col, i);

	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

}
