package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7Wind {
	
Image image = new ImageIcon("src/images/wind.gif").getImage();
	
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	
	public Enemy7Wind(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
