package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class MemoryViewPanel extends JPanel {
	static String[] columnNames = { "Location", "Value" };
	static JScrollPane scrollPane;
	static JTable table;

	static void createTable() {
		table = new JTable(MainGUI.guiData.getMemory(), columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(230, 180));
		table.setFillsViewportHeight(true);
		table.setGridColor(Color.GRAY);
		table.setShowGrid(true);

		// Create the scroll pane and add the table to it.
		scrollPane = new JScrollPane(table);

	}

	public MemoryViewPanel() {

		createTable();

	}

	/**
	 * Redraws the panel.
	 */

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		for (int i = 0; i < MainGUI.guiData.getMemory().length; i++) {
			for (int j = 0; j < MainGUI.guiData.getMemory()[0].length; j++) {
				g.drawString(
						Integer.toString(MainGUI.guiData.getMemory()[i][0]),
						30, 15 + i * 16);
			}
			for (int j = 0; j < MainGUI.guiData.getMemory()[0].length; j++) {
				g.drawString(
						Integer.toString(MainGUI.guiData.getMemory()[i][1]),
						100, 15 + i * 16);
			}
		}

	}

}