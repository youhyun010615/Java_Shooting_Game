package shoot;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy4 {
	Image image = new ImageIcon("src/images/enemy4.gif").getImage();
	Image image2 = new ImageIcon("src/images/enemy4_2.gif").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int hp = 450;
	
	public Enemy4(int x, int y) {
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
