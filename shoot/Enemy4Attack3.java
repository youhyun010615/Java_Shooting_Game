package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy4Attack3 {
	Image image = new ImageIcon("src/images/enemy4_attack3-2.gif").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 60;
	
	public Enemy4Attack3(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
