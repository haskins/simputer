package gui;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import data.DataGenerator;
import data.SimData;

public class MainGUI {
		

	public static ActionPanel ap;
	public static JPanel cards;
	public static SimData guiData;
	public static boolean status = false;
	public static JPanel vp;

	public static void getData() {
		guiData = DataGenerator.randomData();

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		guiData = DataGenerator.zeroData();
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {

					MainGUI window = new MainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public static void updateEverything() {
		vp.repaint();

	}

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 900, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// frame.setAlwaysOnTop(true);
		frame.setTitle("Simputer");

		/*
		 * This is the panel where everything is put into and cycled through
		 * using CardLayout.
		 */
		cards = new JPanel();
		cards.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		cards.setLayout(new CardLayout());

		/*
		 * This adds the first panel to the contentPane, the rest are added in
		 * WelcomePanel once the user selects how many houses they would like to
		 * simulate.
		 */
		WelcomePanel wp = new WelcomePanel();
		cards.add(wp, "Welcome Panel");

		ap = new ActionPanel();
		cards.add(ap, "Action Panel");

		EditProgramPanel edpp = new EditProgramPanel();
		cards.add(edpp, "Edit Program Panel");

		EditRegisterPanel erp = new EditRegisterPanel();
		cards.add(erp, "Edit Register Panel");

		EnterProgramPanel enpp = new EnterProgramPanel();
		cards.add(enpp, "Enter Program Panel");

		vp = new ViewPanel();

		vp.setBounds(0, 0, 900, 225);
		frame.getContentPane().add(vp);

		cards.setBounds(0, 226, 900, 140);
		frame.getContentPane().add(cards);

	}
}
