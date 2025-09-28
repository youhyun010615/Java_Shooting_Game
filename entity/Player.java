package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Main.GamePanel;
import Main.KeyHandler;
import tile.TileManager;

public class Player extends Entity{ //3
	
	GamePanel gp; 
	KeyHandler keyH; 
	
	
	public Player(GamePanel gp, KeyHandler keyH) { 
		
		this.gp = gp;
		this.keyH = keyH;
		
		setDefaultValues(); 
		getPlayerImage(); 
		
		solidArea = new Rectangle();
		solidArea.x = 8;
		solidArea.y = 16;
		solidArea.width = 32;
		solidArea.height = 20;
		
	}
	public void setDefaultValues() {  
		
		worldx = 510; 
		worldy = 35;  
		speed =4; 
		direction = "down"; 
	}
	public void getPlayerImage() { 
		try {
			
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/up1-1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/up1-2.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/down1-1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/down1-2.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/left1-1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/left1-2.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/right1-1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/right1-2.png"));
			
		}catch(IOException e) { 
			e.printStackTrace();
		}
	}
	
	
	public void update() { 
		
		if(keyH.upPressed == true || keyH.downPressed || 
				keyH.leftPressed || keyH.rightPressed == true) { 
			
			if(keyH.upPressed == true ) { 
				direction = "up"; 
			}
			else if(keyH.downPressed == true) {
				direction = "down";
			}
			else if(keyH.leftPressed == true ) {
				direction = "left";			
			}
			else if(keyH.rightPressed == true) {
				direction = "right";
			}
			
			//Check Tile Collision
			collisionOn = false; //5 
			gp.cChecker.checkTile(this);
			
			//If Collision is False, Player can Move ,,4
			
			{
				if (collisionOn == false) {//4
					
					switch(direction) {
					case "up": if(worldy - speed >= 0) worldy -= speed;	break;
					case "down": if(worldy + GamePanel.tileSize + speed <= GamePanel.screenHeight + 1) worldy += speed; break;
					case "left": if(worldx - speed >= 0) worldx -= speed; break;
					case "right": if(worldx + GamePanel.tileSize + speed <= GamePanel.screenWidth) worldx += speed; break;
					}
				}
			}
			
			spriteCounter++; 
			if(spriteCounter > 12)  
			{
				if(spriteNum == 1) {   
					spriteNum = 2;  
				}
				else if(spriteNum ==2) {
					spriteNum =1;
				}
				spriteCounter = 0; 
			}
		}
				
	}
	public void draw(Graphics2D g2) { 
        
//		g2.setColor(Color.white); 
//		
//		g2.fillRect(x, y,gp.tileSize,gp.tileSize); 
//		
		
		BufferedImage image = null; 
		
		switch(direction){ 
		case "up":
			if(spriteNum == 1) {
				image = up1;
			}
			if(spriteNum == 2) {
				image = up2;
			}
			break;
		case "down":
			if(spriteNum == 1) {
				image = down1;
			}
			if(spriteNum == 2) {
				image = down2;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum == 2) {
				image = left2;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum == 2) {
				image = right2;
			}
			break;
			
			
		}
		g2.drawImage(image, worldx, worldy, gp.tileSize, gp.tileSize, null); 
		
	}

}
