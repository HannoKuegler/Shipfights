package Ships;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Hanno extends JPanel implements MouseListener {

	Graphics2D g; 

	static int width = 1000;
	static int height = 1000;
	static int y0 = 200;
	
	
	public Hanno() {

	}

	@Override
	protected void paintComponent(Graphics gr) {
		// TODO Auto-generated method stub
		super.paintComponent(gr);
	
		g = (Graphics2D) gr;
		
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		int mouseX = e.getX(); 
		int mouseY = e.getY(); 
		
		
		
		
		
		
		
	}

	
	

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
