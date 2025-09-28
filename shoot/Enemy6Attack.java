package shoot;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy6Attack {
	Image image = new ImageIcon("src/images/enemy6_attack.png").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 30;
	
	public Enemy6Attack(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void fire() {
		this.x -= 18;
				
	}

}
