package Ships;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JMenuBar;

public class Ship_Frame extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ship_Frame frame = new Ship_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ship_Frame() {
		setTitle("Shiffe versenken ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new Ships_Panel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(0, 0, 994, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		menuGame = new JMenuBar();
		menuGame.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		menuGame.setBounds(10, 0, 127, 54);
		panel.add(menuGame);
		
		JMenu mnGame = new JMenu("Game");
		menuGame.add(mnGame);
		mnGame.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		
		JMenuItem mlRestart = new JMenuItem("Restart");
		mnGame.add(mlRestart);
		mlRestart.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		
		JMenuItem mlExit = new JMenuItem("Exit");
		mlExit.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		mlExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnGame.add(mlExit);
		
		JMenuBar menuShips = new JMenuBar();
		menuShips.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		menuShips.setBounds(10, 62, 127, 54);
		panel.add(menuShips);
		
		JMenu mnShips = new JMenu("Ships");
		menuShips.add(mnShips);
		mnShips.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		
		JMenuItem m1 = new JMenuItem("1x1");
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1x1
			}
		});
		m1.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		mnShips.add(m1);
		
		JMenuItem m2 = new JMenuItem("2x1");
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//2x1
			}
		});
		m2.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		mnShips.add(m2);
		
		JMenuItem m3 = new JMenuItem("3x1");
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//3x1
			}
		});
		m3.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		mnShips.add(m3);
		
		JMenuItem m5 = new JMenuItem("5x1");
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//5x1
			}
		});
		m5.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		mnShips.add(m5);
		
	
	}
}
