package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class EditRegisterPanel extends JPanel {
	private JTextField txtValue;

	/**
	 * Create the panel.
	 */
	public EditRegisterPanel() {
		setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 6, 888, 12);
		add(separator);

		txtValue = new JTextField();
		txtValue.setBounds(356, 58, 134, 28);
		add(txtValue);
		txtValue.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(558, 30, 117, 29);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(558, 59, 117, 29);
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		add(btnCancel);

		JLabel lblLineNumber = new JLabel("Select Register");
		lblLineNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblLineNumber.setBounds(184, 30, 134, 16);
		add(lblLineNumber);

		JLabel lblValue = new JLabel("Value");
		lblValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue.setBounds(356, 30, 134, 16);
		add(lblValue);

		String[] registers = { "AC", "PC", "IR", "MR", "MAR" };

		JComboBox<?> comboBox = new JComboBox<Object>(registers);
		comboBox.setBounds(211, 60, 84, 27);
		add(comboBox);

	}
}
