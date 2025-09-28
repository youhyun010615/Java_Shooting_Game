package shoot;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7 {
	Image image = new ImageIcon("src/images/enemy7.gif").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int hp = 1500;
	
	public Enemy7(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		this.x -= 2;
	}
	public void move2() {
		this.y -= 4;
	}
	public void move3() {
		this.y += 4;
	}


}
