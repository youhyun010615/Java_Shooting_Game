package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy4Attack2 {
	Image image = new ImageIcon("src/images/enemy4_attack2.png").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 5;
	
	public Enemy4Attack2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.x -= 20;
	}
	public void fire2() {
		this.x -= 20;
		this.y -= 5;
	}
	public void fire3() {
		this.x -= 20;
		this.y += 5;
	}

}
