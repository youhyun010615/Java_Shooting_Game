package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy7Warning {
	Image image = new ImageIcon("src/images/enemy7_warning.png").getImage();
	
	int x,y;
	
	public Enemy7Warning(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
