package gui;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class EnterProgramPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public EnterProgramPanel() {
		setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 6, 888, 12);
		add(separator);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setPreferredSize(new Dimension(250, 110));

		JScrollPane scrollPane = new JScrollPane(editorPane,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setAutoscrolls(true);
		scrollPane.setBounds(189, 18, 314, 111);
		add(scrollPane);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(599, 81, 117, 29);
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		add(btnCancel);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(599, 51, 117, 29);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Action Panel");
			}
		});
		add(btnSubmit);

	}
}
