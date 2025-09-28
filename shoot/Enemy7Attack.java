package shoot;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7Attack {
	Image image = new ImageIcon("src/images/enemy7_attack.gif").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 30;
	
	public Enemy7Attack(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
