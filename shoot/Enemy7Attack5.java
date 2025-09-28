package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7Attack5 {
	
	Image image = new ImageIcon("src/images/enemy7_attack5.png").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 25;
	
	public Enemy7Attack5(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.x -= 20;
	}


}
