package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7EmptyAttack {
	
	Image image = new ImageIcon("src/images/enemy7_emptyattack.png").getImage();
	
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	
	public Enemy7EmptyAttack(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.y += 720;
	}

}
