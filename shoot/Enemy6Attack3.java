package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy6Attack3 {
	
	Image image = new ImageIcon("src/images/enemy6_attack3.png").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 10;
	
	public Enemy6Attack3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.x -= 15;
				
	}


}
