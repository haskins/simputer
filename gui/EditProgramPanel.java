package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class EditProgramPanel extends JPanel {
	private JTextField txtNumber;
	private JTextField txtValue;

	/**
	 * Create the panel.
	 */
	public EditProgramPanel() {
		setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 6, 888, 12);
		add(separator);

		txtNumber = new JTextField();
		txtNumber.setBounds(184, 58, 134, 28);
		add(txtNumber);
		txtNumber.setColumns(10);

		txtValue = new JTextField();
		txtValue.setBounds(356, 58, 134, 28);
		add(txtValue);
		txtValue.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		btnSubmit.setBounds(558, 30, 117, 29);
		add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		btnCancel.setBounds(558, 59, 117, 29);
		add(btnCancel);

		JLabel lblLineNumber = new JLabel("Line Number");
		lblLineNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblLineNumber.setBounds(184, 30, 134, 16);
		add(lblLineNumber);

		JLabel lblValue = new JLabel("Value");
		lblValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue.setBounds(356, 30, 134, 16);
		add(lblValue);

	}
}
