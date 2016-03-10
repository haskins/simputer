package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ControlUnitViewPanel extends JPanel {

	ImageLoader active_add = new ImageLoader("src/gui/images/add_active.png",
			0, 0, 90, 30);

	ImageLoader active_branch = new ImageLoader(
			"src/gui/images/branch_active.png", 0, 0, 90, 30);
	ImageLoader active_decode = new ImageLoader(
			"src/gui/images/decode_active.png", 0, 0, 90, 30);

	ImageLoader active_fetch = new ImageLoader(
			"src/gui/images/fetch_active.png", 0, 0, 90, 30);
	ImageLoader active_load = new ImageLoader("src/gui/images/load_active.png",
			0, 0, 90, 30);

	ImageLoader active_store = new ImageLoader(
			"src/gui/images/store_active.png", 0, 0, 90, 30);
	ImageLoader fetch, decode, load, add, store, branch;

	// Add
	ImageLoader inactive_add = new ImageLoader(
			"src/gui/images/add_inactive.png", 0, 0, 90, 30);
	// Branch
	ImageLoader inactive_branch = new ImageLoader(
			"src/gui/images/branch_inactive.png", 0, 0, 90, 30);

	// Decode
	ImageLoader inactive_decode = new ImageLoader(
			"src/gui/images/decode_inactive.png", 0, 0, 90, 30);
	// Fetch
	ImageLoader inactive_fetch = new ImageLoader(
			"src/gui/images/fetch_inactive.png", 0, 0, 90, 30);

	// Load
	ImageLoader inactive_load = new ImageLoader(
			"src/gui/images/load_inactive.png", 0, 0, 90, 30);
	// Store
	ImageLoader inactive_store = new ImageLoader(
			"src/gui/images/store_inactive.png", 0, 0, 90, 30);

	// Lines
	ImageLoader lines = new ImageLoader("src/gui/images/lines.png", 0, 0, 336,
			183);
	int x_adjust = 8;

	int y_adjust = 13;

	/**
	 * Create the panel.
	 */
	public ControlUnitViewPanel() {
		setLayout(null);

	}

	private void allInactive() {
		fetch = inactive_fetch;
		decode = inactive_decode;
		load = inactive_load;
		add = inactive_add;
		store = inactive_store;
		branch = inactive_branch;
	}

	/**
	 * Redraws the panel.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);

		switch (MainGUI.guiData.getState()) {
		case OFF:
			allInactive();
			break;
		case FETCH:
			allInactive();
			fetch = active_fetch;
			break;
		case DECODE:
			allInactive();
			decode = active_decode;
			break;
		case LOAD:
			allInactive();
			load = active_load;
			break;
		case ADD:
			allInactive();
			add = active_add;
			break;
		case STORE:
			allInactive();
			store = active_store;
			break;
		case BRANCH:
			allInactive();
			branch = active_branch;
			break;
		default:
			System.err.println("Error on switch, in state for GUI");
			break;

		}

		g.drawImage(fetch.getImage(), 170 - x_adjust, 0 + y_adjust,
				fetch.getWidth(), fetch.getHeight(), null);

		g.drawImage(decode.getImage(), 170 - x_adjust, 70 + y_adjust,
				decode.getWidth(), decode.getHeight(), null);

		g.drawImage(add.getImage(), 34 - x_adjust, 140 + y_adjust,
				add.getWidth(), add.getHeight(), null);

		g.drawImage(store.getImage(), 126 - x_adjust, 140 + y_adjust,
				store.getWidth(), store.getHeight(), null);

		g.drawImage(load.getImage(), 218 - x_adjust, 140 + y_adjust,
				load.getWidth(), load.getHeight(), null);

		g.drawImage(branch.getImage(), 310 - x_adjust, 140 + y_adjust,
				branch.getWidth(), branch.getHeight(), null);

		g.drawImage(lines.getImage(), 20 - x_adjust, 14 + y_adjust,
				lines.getWidth(), lines.getHeight(), null);

	}
}
