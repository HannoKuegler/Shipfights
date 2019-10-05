package Ships;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Hanno extends JPanel implements MouseListener, MouseMotionListener {

	public static Graphics2D g;

	static int mouseX;
	static int mouseY;
	static int width = 1000;
	static int height = 1000;
	static int y0 = 200;
	static int thick = 40; 
	
	static int ship;

	public Hanno() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	protected void paintComponent(Graphics gr) {
		// TODO Auto-generated method stub
		super.paintComponent(gr);
		g = (Graphics2D) gr;


		if(ship == 1) {
			drawMouse(mouseX, mouseY);	
			System.out.println("Hello");
			}
		
	}

	public static void getInformations(int s) {

		ship = s;

	}
	
	public static void drawMouse(int mouseX, int mouseY) {
		g.setColor(Color.BLUE);
		g.fillRect(mouseX-thick/2, mouseY-thick/2, thick, thick);
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		mouseX = e.getX();
		mouseY = e.getY();

		
		
		if(ship == 1) {
		drawMouse(mouseX, mouseY);	
		System.out.println("Hello");
		}
		
		repaint();
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
