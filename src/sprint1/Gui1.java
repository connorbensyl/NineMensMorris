package sprint1;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import sprint1.Board;
import sprint1.Rectangles;

import javax.swing.SwingConstants;



public class Gui1 extends JFrame {

	private Board board;
	
	Controller controller;
	
	
	public void setUp()	throws Exception{
		board = new Board();
	}
	
	public void tearDown() throws Exception{
	}
	
	JFrame NineMensMorris;
	JFrame PlayerVsPlayer;
	JFrame PlayerVsAI;
	JPanel NineMensMorrisBG;
	JPanel NineMensMorrisPVP;
	JPanel NineMensMorrisPVA;
	private JTextField txtWelcome;
	int yRecieved;
	int xRecieved;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui1 window = new Gui1();
					window.NineMensMorris.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui1(){
		initialize();
		controller = new Controller(this);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {  
					int yRecieved = e.getY(); /// CELL_SIZE;
					int xRecieved = e.getX(); /// CELL_SIZE;
			}
		});
	}
	

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		
		
		Rectangles pvprect = new Rectangles();
		Rectangles pvarect = new Rectangles();
		
		NineMensMorris = new JFrame();
		NineMensMorris.setTitle("Nine Men's Morris");
		NineMensMorris.setSize(1920,1080);
		NineMensMorris.setExtendedState(JFrame.MAXIMIZED_BOTH);
		NineMensMorris.setVisible(true);
		NineMensMorris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		PlayerVsPlayer = new JFrame();
		PlayerVsPlayer.setTitle("Nine Men's Morris: Player VS Player");
		PlayerVsPlayer.setSize(1920,1080);
		PlayerVsPlayer.setExtendedState(JFrame.MAXIMIZED_BOTH);
		PlayerVsPlayer.add(pvprect);
		PlayerVsPlayer.setVisible(false);
		PlayerVsPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		PlayerVsAI = new JFrame();
		PlayerVsAI.setTitle("Nine Men's Morris: Player VS AI");
		PlayerVsAI.setSize(1920,1080);
		PlayerVsAI.setExtendedState(JFrame.MAXIMIZED_BOTH);
		PlayerVsAI.add(pvarect);
		PlayerVsAI.setVisible(false);
		PlayerVsAI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		NineMensMorrisBG = new JPanel();
		NineMensMorrisBG.setBounds(0, 0, 1920, 1080);
		NineMensMorrisBG.setBackground(new Color(240, 255, 240));
		NineMensMorrisBG.setLayout(null);
		NineMensMorris.getContentPane().add(NineMensMorrisBG);
		
		
		
		txtWelcome = new JTextField();
		txtWelcome.setBackground(new Color(245, 245, 220));
		txtWelcome.setForeground(Color.BLUE);
		txtWelcome.setEditable(false);
		txtWelcome.setText("Welcome to Nine Men's Morris");
		txtWelcome.setBounds(488, 165, 273, 92);
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		NineMensMorrisBG.add(txtWelcome);
		txtWelcome.setColumns(10);

		
		JButton PVPButton = new JButton("Player VS Player");
		PVPButton.setForeground(Color.RED);
		PVPButton.setBounds(554,290,147,29);
		PVPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerVsPlayer.setVisible(true);
				NineMensMorris.setVisible(false);
				

			}
		});


		NineMensMorrisBG.add(PVPButton);
		
		JButton PVAIButton = new JButton("Player VS AI");
		PVAIButton.setBounds(569, 358, 121, 29);
		PVAIButton.setForeground(Color.MAGENTA);
		PVAIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerVsAI.setVisible(true);
				NineMensMorris.setVisible(false);
			
			}
		});
		
		NineMensMorrisBG.add(PVAIButton);


	}
}
