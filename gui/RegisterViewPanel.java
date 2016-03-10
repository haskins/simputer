package gui;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RegisterViewPanel extends JPanel {
	private JTextField AC_txt, PC_txt, IR_txt, MR_txt, MAR_txt;

	public RegisterViewPanel() {

		// Labels
		JLabel AC_lbl = new JLabel("AC");
		AC_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		AC_lbl.setBounds(18, 15, 30, 28);
		add(AC_lbl);

		JLabel PC_lbl = new JLabel("PC");
		PC_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		PC_lbl.setBounds(18, 56, 30, 30);
		add(PC_lbl);

		JLabel IR_lbl = new JLabel("IR");
		IR_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		IR_lbl.setBounds(18, 97, 30, 30);
		add(IR_lbl);

		JLabel MR_lbl = new JLabel("MR");
		MR_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		MR_lbl.setBounds(18, 138, 30, 30);
		add(MR_lbl);

		JLabel MAR_lbl = new JLabel("MAR");
		MAR_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		MAR_lbl.setBounds(18, 179, 30, 30);
		add(MAR_lbl);

		// Values
		AC_txt = new JTextField();
		AC_txt.setBounds(66, 15, 134, 28);
		AC_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		AC_txt.setEditable(false);
		AC_txt.setColumns(10);
		add(AC_txt);

		PC_txt = new JTextField();
		PC_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		PC_txt.setEditable(false);
		PC_txt.setColumns(10);
		PC_txt.setBounds(66, 56, 134, 28);
		add(PC_txt);

		IR_txt = new JTextField();
		IR_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		IR_txt.setEditable(false);
		IR_txt.setColumns(10);
		IR_txt.setBounds(66, 97, 134, 28);
		add(IR_txt);

		MR_txt = new JTextField();
		MR_txt.setHorizontalAlignment(SwingConstants.RIGHT);

		MR_txt.setEditable(false);
		MR_txt.setColumns(10);
		MR_txt.setBounds(66, 138, 134, 28);
		add(MR_txt);

		MAR_txt = new JTextField();
		MAR_txt.setHorizontalAlignment(SwingConstants.RIGHT);
		MAR_txt.setEditable(false);
		MAR_txt.setColumns(10);
		MAR_txt.setBounds(66, 179, 134, 28);
		add(MAR_txt);
	}

	/**
	 * Redraws the panel.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		AC_txt.setText("" + Integer.toBinaryString(MainGUI.guiData.getRV()[0]));
		PC_txt.setText("" + Integer.toBinaryString(MainGUI.guiData.getRV()[1]));
		IR_txt.setText("" + Integer.toBinaryString(MainGUI.guiData.getRV()[2]));
		MR_txt.setText("" + Integer.toBinaryString(MainGUI.guiData.getRV()[3]));
		MAR_txt.setText("" + Integer.toBinaryString(MainGUI.guiData.getRV()[4]));

	}

}