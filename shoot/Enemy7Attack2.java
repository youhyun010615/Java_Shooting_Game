package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7Attack2 {
	
	Image image = new ImageIcon("src/images/enemy7_attack2.gif").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 1;
	
	public Enemy7Attack2(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
