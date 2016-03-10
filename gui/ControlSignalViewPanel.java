package gui;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ControlSignalViewPanel extends JPanel {
	ImageLoader inactive, active, memory, register, alu;
	String long_path = "/Users/haskins/Dropbox/Eclipse/Simputer/";

	public ControlSignalViewPanel() {
		setLayout(null);

		JLabel lblMemory = new JLabel("Memory");
		lblMemory.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemory.setBounds(6, 15, 61, 16);
		add(lblMemory);

		inactive = new ImageLoader("src/gui/images/inactive.png", 0, 0, 15, 15);

		active = new ImageLoader("src/gui/images/active.png", 0, 0, 15, 15);

		JLabel lblAlu = new JLabel("ALU");
		lblAlu.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlu.setBounds(183, 15, 61, 16);
		add(lblAlu);

		JLabel lblRegister = new JLabel("Register");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setBounds(6, 15, 238, 16);
		add(lblRegister);

	}

	/**
	 * Redraws the panel.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		switch (MainGUI.guiData.getCS()) {
		case 0:
			memory = inactive;
			register = inactive;
			alu = inactive;
			break;
		case 1:
			memory = inactive;
			register = inactive;
			alu = active;
			break;
		case 2:
			memory = inactive;
			register = active;
			alu = inactive;
			break;
		case 3:
			memory = inactive;
			register = active;
			alu = active;
			break;
		case 4:
			memory = active;
			register = inactive;
			alu = inactive;
			break;
		case 5:
			memory = active;
			register = inactive;
			alu = active;
			break;
		case 6:
			memory = active;
			register = active;
			alu = inactive;
			break;
		case 7:
			memory = active;
			register = active;
			alu = active;
			break;
		}

		g.drawImage(memory.getImage(), 30, 37, memory.getWidth(),
				memory.getHeight(), null);

		g.drawImage(register.getImage(), 118, 37, register.getWidth(),
				register.getHeight(), null);

		g.drawImage(alu.getImage(), 207, 37, alu.getWidth(), alu.getHeight(),
				null);

	}
}