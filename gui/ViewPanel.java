package gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class ViewPanel extends JPanel {

	public static JPanel rp, msp, mp;

	/*
	 * public void updateData(SimData d){ //TODO }
	 */

	/**
	 * Create the panel.
	 */
	public ViewPanel() {
		setLayout(null);

		// Register View Panel
		rp = new RegisterViewPanel();
		rp.setBorder(new TitledBorder(null, "Registers", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		rp.setBounds(6, 5, 210, 220);
		rp.setLayout(null);
		add(rp);

		// Memory View
		mp = new JPanel();
		mp.setBounds(230, 5, 250, 150);
		msp = new MemoryViewPanel();
		msp.setPreferredSize(new Dimension(220, 1600));
		JScrollPane scroll = new JScrollPane(msp);
		msp.setAutoscrolls(true);
		scroll.setBorder(null);
		scroll.setPreferredSize(new Dimension(240, 120));
		mp.add(scroll);
		mp.setBorder(new TitledBorder(null, "Memory", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		add(mp);

		// Control Unit State Panel
		JPanel cup = new ControlUnitViewPanel();
		cup.setBounds(494, 5, 400, 220);
		cup.setBorder(new TitledBorder(null, "Control Unit",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(cup);

		// Control Signal View Panel
		JPanel csvp = new ControlSignalViewPanel();
		csvp.setBorder(new TitledBorder(null, "Control Signals",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		csvp.setBounds(230, 160, 250, 65);
		// csvp.setBackground(Color.BLACK);
		add(csvp);
	}

	public JPanel createNewMemPanel() {
		return new MemoryViewPanel();
	}

	/**
	 * Redraws the panel.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		rp.repaint();
		msp.repaint();
		mp.repaint();
	}

}
