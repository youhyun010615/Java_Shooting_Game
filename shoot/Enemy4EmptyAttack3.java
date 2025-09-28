package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy4EmptyAttack3 {
	
Image image = new ImageIcon("src/images/enemy4_emptyattack3.png").getImage();
	
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	
	public Enemy4EmptyAttack3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.y += 720;
	}

}
