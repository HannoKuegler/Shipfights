package Ships;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Ships_Panel extends JPanel {

	Graphics2D g; 
	static int width = 1200;
	static int height = 1200;
	static int y0 = 200;
	static int test11111; 
	
	public Ships_Panel() {
		setBackground(Color.gray);
	}

	@Override
	protected void paintComponent(Graphics gr) {
		super.paintComponent(gr);
		g = (Graphics2D)gr;
		
		draw10x10();
		
	}
	
	public void draw10x10() {
		
		int lines = 10; 
		
		int x = width / 10 ;
		int y = height / 10 + 200;
		
		
			
			
		g.setColor(Color.BLACK);
		for (int i = 0; i < lines; i++) {
			
			//x
			g.drawLine(x , 0, x, height);
			x += width/10; 
			
			//y
			g.drawLine(0, y, width, y);
			y += height/10;
			
			
		}
		
 }
}













