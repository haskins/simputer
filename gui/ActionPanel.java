package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ActionPanel extends JPanel {

	final JButton btnEnterProgram, btnEditProgram, btnEditRegister, btnRunStop,
			btnStep, btnPauseResume, btnReset, btnSaveMemory,
			btnSaveEverything;
	private JLabel lblSpeed;

	/**
	 * Create the panel.
	 */
	public ActionPanel() {
		setLayout(null);

		btnEnterProgram = new JButton("Enter Program");
		btnEnterProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Enter Program Panel");
			}
		});
		btnEnterProgram.setBounds(360, 19, 175, 29);
		add(btnEnterProgram);

		btnEditProgram = new JButton("Edit Program");
		btnEditProgram.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Edit Program Panel");
			}
		});
		btnEditProgram.setBounds(360, 101, 175, 29);
		add(btnEditProgram);

		btnEditRegister = new JButton("Edit Register");
		btnEditRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (MainGUI.cards.getLayout());
				cl.show(MainGUI.cards, "Edit Register Panel");
			}
		});
		btnEditRegister.setBounds(360, 60, 175, 29);
		add(btnEditRegister);

		btnRunStop = new JButton("Run");
		btnRunStop.setBounds(10, 19, 175, 29);
		btnRunStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnRunStop.getText().equals("Run")) {
					btnRunStop.setText("Stop");
					btnPauseResume.setText("Pause");
					controlButtonGroupEnable(true, true, false, true, true);
					actorButtonGroupEnable(false, false, false, false, false);
					MainGUI.status = true;

				} else {
					btnRunStop.setText("Run");
					controlButtonGroupEnable(true, true, true, false, true);
					btnPauseResume.setText("Pause");
					actorButtonGroupEnable(true, true, true, true, true);
					MainGUI.status = false;

				}
			}
		});
		add(btnRunStop);

		btnStep = new JButton("Step");
		btnStep.setBounds(10, 60, 175, 29);
		btnStep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				controlButtonGroupEnable(true, true, true, true, true);
				btnPauseResume.setText("Resume");
				btnRunStop.setText("Stop");

			}
		});
		add(btnStep);

		btnPauseResume = new JButton("Pause");
		btnPauseResume.setBounds(185, 19, 175, 29);
		btnPauseResume.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnPauseResume.getText().equals("Pause")) {
					btnPauseResume.setText("Resume");
					controlButtonGroupEnable(true, true, true, true, true);
					actorButtonGroupEnable(true, true, true, true, true);

				} else {
					btnPauseResume.setText("Pause");
					controlButtonGroupEnable(true, true, false, true, true);
					actorButtonGroupEnable(false, false, false, false, false);

				}
			}
		});
		btnPauseResume.setEnabled(false);
		add(btnPauseResume);

		btnReset = new JButton("Reset");
		btnReset.setBounds(185, 60, 175, 29);
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				controlButtonGroupEnable(true, true, true, false, true);
				btnPauseResume.setText("Pause");
				btnRunStop.setText("Run");

			}
		});
		add(btnReset);

		btnSaveMemory = new JButton("Save Memory");
		btnSaveMemory.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser saveFile = new JFileChooser();
				saveFile.showSaveDialog(null);
			}
		});
		btnSaveMemory.setBounds(535, 19, 175, 29);
		add(btnSaveMemory);

		btnSaveEverything = new JButton("Save Everything");
		btnSaveEverything.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser saveFile = new JFileChooser();
				saveFile.showSaveDialog(null);
			}
		});
		btnSaveEverything.setBounds(535, 60, 175, 29);
		add(btnSaveEverything);

		JSeparator separator = new JSeparator();
		separator.setBounds(6, 6, 888, 12);
		add(separator);

		JSlider slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(2);
		slider.setMaximum(8);
		slider.setSnapToTicks(true);
		slider.setBounds(781, 15, 100, 115);

		Hashtable<Integer, JLabel> labels = new Hashtable<Integer, JLabel>();
		labels.put(0, new JLabel("Slug"));
		labels.put(2, new JLabel("Turtle"));
		labels.put(4, new JLabel("Slower"));
		labels.put(6, new JLabel("Slow"));
		labels.put(8, new JLabel("Regular"));
		slider.setLabelTable(labels);

		slider.setPaintLabels(true);

		add(slider);

		JLabel lblSS = new JLabel("Simulation");
		lblSS.setHorizontalAlignment(SwingConstants.LEFT);
		lblSS.setBounds(722, 50, 83, 16);
		add(lblSS);

		JButton btn_random = new JButton("Randomize Data");
		btn_random.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainGUI.getData();
				MainGUI.updateEverything();
			}
		});
		btn_random.setBounds(535, 101, 175, 29);
		add(btn_random);

		lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(722, 65, 83, 16);
		add(lblSpeed);

	}

	public void actorButtonGroupEnable(boolean enp, boolean edp, boolean er,
			boolean sm, boolean se) {
		btnEnterProgram.setEnabled(enp);
		btnEditProgram.setEnabled(edp);
		btnEditRegister.setEnabled(er);
		btnSaveMemory.setEnabled(sm);
		btnSaveEverything.setEnabled(se);
	}

	public void controlButtonGroupEnable(boolean ss, boolean rs, boolean s,
			boolean ps, boolean r) {
		btnRunStop.setEnabled(rs);
		btnStep.setEnabled(s);
		btnPauseResume.setEnabled(ps);
		btnReset.setEnabled(r);
	}
}
