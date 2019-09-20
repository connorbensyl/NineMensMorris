package sprint1;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Gui {

	private Board board;
	
	public void setUp()	throws Exception{
		board = new Board();
	}
	
	public void tearDown() throws Exception{
	}
	
	JFrame NineMensMorris;
	JPanel NineMensMorrisBG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		NineMensMorris = new JFrame();
		NineMensMorris.setTitle("Nine Men's Morris");
		NineMensMorris.setExtendedState(JFrame.MAXIMIZED_BOTH);
		NineMensMorris.setVisible(true);
		NineMensMorris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		NineMensMorrisBG = new JPanel();
		NineMensMorrisBG.setBounds(0, 0, 1920, 1080);
		NineMensMorrisBG.setBackground(new Color(240, 255, 240));
		NineMensMorris.getContentPane().add(NineMensMorrisBG);
		
		JButton PVPButton = new JButton("Player VS Player");
		PVPButton.setForeground(Color.RED);
		PVPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NineMensMorrisBG.setLayout(null);
		
		PVPButton.setBounds(392,197,147,29);
		NineMensMorrisBG.add(PVPButton);
		
		JButton PVAIButton = new JButton("Player VS AI");
		PVAIButton.setBounds(404, 259, 121, 29);
		PVAIButton.setForeground(Color.MAGENTA);
		PVAIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NineMensMorrisBG.add(PVAIButton);
		


	}

}
