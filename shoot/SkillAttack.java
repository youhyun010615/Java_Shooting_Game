


package shoot;

import java.awt.Image;

import javax.swing.ImageIcon;

public class SkillAttack {
	Image skillImage = new ImageIcon("src/images/skill_attack.gif").getImage();
	
	int x,y;
	int width = skillImage.getWidth(null);
	int height = skillImage.getHeight(null);
	int attack = 3;
	
	public SkillAttack(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	public void fire() {
		this.x += 8;
		
	}
	
}
