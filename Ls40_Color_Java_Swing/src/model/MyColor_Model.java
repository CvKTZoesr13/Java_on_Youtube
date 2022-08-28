package model;

import java.awt.Color;

public class MyColor_Model {
	private Color foreground, background;
	
	private boolean opaque;
	
	
	public MyColor_Model() {
		this.foreground = Color.BLACK;
		this.background = Color.WHITE;
		this.opaque = true;
	}


	public Color getForeground() {
		return foreground;
	}


	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}


	public Color getBackground() {
		return background;
	}


	public void setBackground(Color background) {
		this.background = background;
	}


	public boolean isOpaque() {
		return opaque;
	}


	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
	
	
}
