package alternative_with_2D_Array;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GameGuiCanvas extends Canvas {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3851704009281440549L;
	
	public GameGuiCanvas(int width, int height, String title, Controller controller){
		JFrame gui = new JFrame(title);
		//JFrame is the frame of our window
		gui.setPreferredSize(new Dimension(width, height));
		gui.setMaximumSize(new Dimension(width, height));
		gui.setMinimumSize(new Dimension(width, height));
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//stops thread when window closes
		gui.setResizable(false);
		gui.setLocationRelativeTo(null);
		//starts window in screen center
		gui.add(controller);
		gui.setVisible(true);
		controller.start();
	}

}
