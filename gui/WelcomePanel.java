package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class WelcomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public WelcomePanel() {
		setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 6, 888, 12);
		add(separator);

		JButton btnLoadFromSave = new JButton("Load From Save");
		btnLoadFromSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser openFile = new JFileChooser();
				openFile.showOpenDialog(null);
			}
		});
		btnLoadFromSave.setBounds(288, 47, 150, 29);
		add(btnLoadFromSave);

		JButton btnNewSimulation = new JButton("New Simulation");
		btnNewSimulation.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		btnNewSimulation.setBounds(442, 47, 150, 29);
		add(btnNewSimulation);

	}
}
