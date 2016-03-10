/**
 * This object helps the GUI in drawing images. The name Berry is because the
 * initial image we were trying to draw was a strawberry, and it seemed fitting
 * to keep the name due to the issues we had drawing images.
 *
 * @author Devon Harker, Josh Haskins, Vincent Tennant
 * @version 2013-04-03
 */
package gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	private Image img;
	private boolean isVisible;
	private int x, y, width, height;

	/**
	 * Constructor for Berry object.
	 * 
	 * @param fn
	 *            location of image
	 * @param x
	 *            the x coordinate
	 * @param y
	 *            the y coordinate
	 * @param w
	 *            the width of the image
	 * @param h
	 *            the height of the image
	 */
	public ImageLoader(String fn, int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;

		try {
			img = ImageIO.read(new File(fn));
		} catch (IOException e) {
			System.err.println("error on file location: Berry.java");
		}

		/*
		 * Need images to be invisible on creation, as to display then we make
		 * them visible and cycle through the array.
		 */
		isVisible = false;
	}

	/**
	 * Gets the hight of the image.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Gets the image.
	 */
	public Image getImage() {
		return img;
	}

	/**
	 * Gets the width of the image.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Gets the x coordinate.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gets the y coordinate.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Returns the visibility of the image.
	 */
	public boolean isVisible() {
		return isVisible;
	}

	/**
	 * Sets image to invisible.
	 */
	public void setInVisible() {
		isVisible = false;
	}

	/**
	 * Sets image to visible.
	 */
	public void setVisible() {
		isVisible = true;
	}
}
