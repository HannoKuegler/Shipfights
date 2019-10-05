package Ships;

import java.awt.Color;
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
	static int thick = 40; 
	
	static int ship;

	public Hanno() {

		setBackground(Color.green);
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

		g.setColor(Color.BLUE);
		
		switch (ship) {
		case 1:
			g.fillRect(mouseX-thick/2, mouseY-thick/2, thick, thick);
			
			break;
		case 2:

			break;
		case 3:

			break;
		case 5:

		default:
			break;
		}

	}

	public static void getInformations(int s) {

		ship = s;

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
