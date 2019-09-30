package sprint1_testing;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Graphics;
import javax.swing.border.EmptyBorder;
import sprint1.Board;


import javax.swing.SwingConstants;



public class TestGUI extends JFrame{

	private Board board;
	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestGUI window = new TestGUI();
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
	public TestGUI() {
		initialize();
	}

	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(0, 450, 200, 150);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
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
		PlayerVsPlayer.setVisible(false);
		PlayerVsPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PlayerVsAI = new JFrame();
		PlayerVsAI.setTitle("Nine Men's Morris: Player VS AI");
		PlayerVsAI.setSize(1920,1080);
		PlayerVsAI.setExtendedState(JFrame.MAXIMIZED_BOTH);
		PlayerVsAI.setVisible(false);
		PlayerVsAI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		
		NineMensMorrisBG = new JPanel();
		NineMensMorrisBG.setBounds(0, 0, 1920, 1080);
		NineMensMorrisBG.setBackground(new Color(240, 255, 240));
		NineMensMorrisBG.setLayout(null);
		NineMensMorris.getContentPane().add(NineMensMorrisBG);
		
		NineMensMorrisPVP = new JPanel();
		NineMensMorrisPVP.setBounds(0, 0, 1920, 1080);
		NineMensMorrisPVP.setBackground(new Color(102, 255, 240));
		NineMensMorrisPVP.setLayout(null);
		PlayerVsPlayer.getContentPane().add(NineMensMorrisPVP);
		
		
		NineMensMorrisPVA = new JPanel();
		NineMensMorrisPVA.setBounds(0, 0, 1920, 1080);
		NineMensMorrisPVA.setBackground(new Color(102, 90, 240));
		NineMensMorrisPVA.setLayout(null);
		PlayerVsAI.getContentPane().add(NineMensMorrisPVA);
		
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
				NineMensMorris.setVisible(false);
				PlayerVsAI.setVisible(true);
			}
		});
		
		NineMensMorrisBG.add(PVAIButton);


	}
}
