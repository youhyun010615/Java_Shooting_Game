package tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.imageio.ImageIO;

import Main.GamePanel;

public class TileManager {
	
	GamePanel gp; //GamePanel �ъ��(4-2)
	public Tile[] tile; // ���� 諛곗�� ����(4-3)
	public int mapTileNum[][]; //硫�紐⑥�μ���� 媛��몄���� 諛곌꼍 梨���二쇰�� 諛곗�� (4-15)
	
	public TileManager(GamePanel gp) { //���� 愿�由� ���깆��
		this.gp = gp;
		
		tile = new Tile[20]; // ���� 諛곗�댁�� �ш린 �ㅼ��, �щ�ш��� ���� �� , 臾� , 踰� ���� �깅�� 
		mapTileNum = new int [gp.maxScreenCol][gp.maxScreenRow]; // map01.txt�� �ㅼ�닿� ���� �レ��瑜� mapTlieNum 諛곗�댁�� �ｌ��寃��� (4-16)
		
		getTileImage(); //硫����� �몄� (4-4)
		loadMap("/maps/map01.txt"); // 硫����� �몄�, 寃쎈�源�吏� �ｌ����(4-28)
	}
	
	public void getTileImage() { // 諛곗�대� 媛�媛��� �대�몄� ����(4-3)

		try {
			
			tile[0] = new Tile(); // 媛� 諛곗�� 諛⑹�� �대�몄� 異�媛�(4-5)
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor.png")); // BufferedImage�대�몄��� 異�媛�(4-6)
			
			tile[1] = new Tile();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/computer-48-right.png"));
			tile[1].collision = true;
			
			tile[2] = new Tile();
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/computer-48-middle.png"));
			tile[2].collision = true;
			
			tile[3] = new Tile();
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/computer-48-left.png"));
			tile[3].collision = true;
			
			tile[4] = new Tile();
			tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/chair1.png"));
			
			tile[5] = new Tile();
			tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/computer-10.png"));
			tile[5].collision = true;
			
			tile[6] = new Tile();
			tile[6].image = ImageIO.read(getClass().getResourceAsStream("/tiles/table1.png"));
			tile[6].collision = true;
			
			tile[7] = new Tile();
			tile[7].image = ImageIO.read(getClass().getResourceAsStream("/tiles/table2.png"));
			tile[7].collision = true;
			
			tile[8] = new Tile();
			tile[8].image = ImageIO.read(getClass().getResourceAsStream("/tiles/door1.png"));
			tile[8].collision = true;
			
			tile[9] = new Tile();
			tile[9].image = ImageIO.read(getClass().getResourceAsStream("/tiles/door2.png"));
			tile[9].collision = true;
			
			tile[10] = new Tile();
			tile[10].image = ImageIO.read(getClass().getResourceAsStream("/tiles/blackboard(1).png"));
			tile[10].collision = true;
			
			tile[11] = new Tile();
			tile[11].image = ImageIO.read(getClass().getResourceAsStream("/tiles/blackboard(2).png"));
			tile[11].collision = true;
		
			tile[12] = new Tile();
			tile[12].image = ImageIO.read(getClass().getResourceAsStream("/tiles/blackboard(3).png"));
			tile[12].collision = true;
			
			tile[13] = new Tile();
			tile[13].image = ImageIO.read(getClass().getResourceAsStream("/tiles/blackboard(4).png"));
			tile[13].collision = true;
			
			tile[14] = new Tile();
			tile[14].image = ImageIO.read(getClass().getResourceAsStream("/tiles/blackboard(5).png"));
			tile[14].collision = true;
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void loadMap(String filePath) { //(4-28)
		
		
		try {
			InputStream is = getClass().getResourceAsStream(filePath); //InputStream�� �ъ�⑺���� ���ㅽ�� ����(硫�紐⑥�� 留�)�� 媛��몄�⑤�� (4-17) //(4-28)
			BufferedReader br = new BufferedReader(new InputStreamReader(is)); //BufferedREader瑜� �ъ�⑺���� �� ���ㅽ�� ���쇱�� �댁�⑹�� �쎈���� (4-18)
			
			int col = 0;
			int row = 0;
			
			while(col < gp.maxScreenCol && row < gp.maxScreenRow) { //��怨� �댁�� 理��� ��怨� 理��� �대낫�� ���ㅻ㈃(4-19)
				
				String line = br.readLine(); // 硫�紐⑥�� ���ㅽ�몄���� ��以��� �쎌�댁�(4-20)
				
				while(col < gp.maxScreenCol) { // �댁�� 理��� �대낫�� ���쇰㈃(4-21)
					
					String numbers[] = line.split(" "); // 臾몄���� 怨듬갚�� 湲곗��쇰� �����댁�� 臾몄���� 諛곗�대� 留�����寃�
					// ��瑜� �ㅼ�� line�� "1 2 3"�대�쇰�� 臾몄���댁�� �ㅼ�댁�ㅻ㈃, numbers 諛곗�댁���� "1", "2", "3"�대��寃� �ㅼ�닿�(4-22)
					
					int num = Integer.parseInt(numbers[col]); // 臾몄���댁�� �������쇰� 諛�轅��� ���ν�댁� (4-23)
					
					mapTileNum[col][row] = num; 
					col++; // 媛��댁�� 泥�由ы�� ��留� col蹂��� 1利�媛� (4-24)
				}
				if(col == gp.maxScreenCol) { //留��� �댁�� 理����댁�대�� 媛��댁�硫�
					col = 0; // �� 珥�湲고��
					row++; // �� ���� 異�媛� (4-25)
				}
			}
			br.close(); //BufferReader�ъ�� ��吏� ����嫄곌린 ��臾몄�� �レ��(4-26)
			
			
		}catch(Exception e) {
			
		}
	}
	
	

	public void draw(Graphics2D g2) { // (4-6)
		
		
		int col = 0; //�� (4-9)
		int row = 0; //�� (4-10)
		int x = 0; 
		int y = 0;
		
		while(col < gp.maxScreenCol && row < gp.maxScreenRow) { //�닿낵 ���� ��硫댁�� 理���移�蹂대�� ���� (4-11)
			
			int tileNum = mapTileNum[col][row]; // mapTileNum���� �レ��瑜� 異�異����� ���� 踰��몃� 媛��몄�� (4-27)
			
			g2.drawImage(tile[tileNum].image, x, y, gp.tileSize, gp.tileSize, null); //洹몃┫ ����, x,y,��鍮�,����,imageObserver = null
			col++; // �댁�� ������ 異�媛� //(4-12)
			x+= gp.tileSize; //x醫����� ���� �ъ�댁� 留��� ����湲� (4-13)
			
			if(col == gp.maxScreenCol) { // �댁�� �ш린媛� 理��� �댁�� �ш린�� 媛���吏�硫� 
				col = 0; //�� 0�쇰� 珥�湲고��
				x =0; //x 醫��� 0�쇰� 珥�湲고��
				row++; //�� ���� 異�媛�
				y +=gp.tileSize; //y醫����� ���� �ъ�댁� 留��� ����湲�(4-14)
			}
		}
		
		
	}

}

