package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7Attack3 {
	
	Image image = new ImageIcon("src/images/enemy7_attack3.gif").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 30;
	
	public Enemy7Attack3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.x -= 20;
		if(Math.random() <=0.5)
			this.y -= 10;
			else
			this.y += 10;
	}
	
	public void fire2() {
		this.x -= 20;
		this.y -= 9;
	}
	public void fire3() {
		this.x -= 20;
		this.y += 9;
		
	}

}
