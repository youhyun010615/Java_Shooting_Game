package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy4Attack3Warning {

	Image image = new ImageIcon("src/images/enemy4_attack3.gif").getImage();
	
	int x,y;
	
	public Enemy4Attack3Warning(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
