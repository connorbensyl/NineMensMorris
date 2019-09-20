package sprint1;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Gui1 {

	private
	
	JFrame NineMensMorris;
	JPanel NineMensMorrisBG;
	private JTextField txtWelcome;

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
	public Gui1() {
		initialize();
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
		NineMensMorris.getContentPane().setLayout(new BorderLayout(0, 0));

		
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
		
		PVPButton.setBounds(547,291,147,29);
		NineMensMorrisBG.add(PVPButton);
		
		JButton PVAIButton = new JButton("Player VS AI");
		PVAIButton.setBounds(562, 358, 121, 29);
		PVAIButton.setForeground(Color.MAGENTA);
		PVAIButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		NineMensMorrisBG.add(PVAIButton);
		
		txtWelcome = new JTextField();
		txtWelcome.setEditable(false);
		txtWelcome.setText("Welcome to Nine Men's Morris");
		txtWelcome.setBounds(488, 165, 273, 92);
		txtWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		NineMensMorrisBG.add(txtWelcome);
		txtWelcome.setColumns(10);



	}
}
