package sprint1;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.JPanel;

import sprint1.Controller;

//import sprint3.product.Board.GameState;


public class Rectangles extends JPanel {
	

	
	@Override
	   public Dimension getPreferredSize() {
	        return new Dimension(1920, 1080);
	    }
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		
		//Outer top
		g2d.setColor(Color.BLACK);
		g2d.drawRect(350,70,500,10);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(350,70,500,10);  
	    
	    //Outer left
	    g2d.setColor(Color.BLACK);
		g2d.drawRect(350,70,10,500);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(350,70,10,500);  
	    
	    //outer bottom
		g2d.setColor(Color.BLACK);
		g2d.drawRect(350,570,500,10); 
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(350,570,500,10); 
	    
	    //outer right
		g2d.setColor(Color.BLACK);
		g2d.drawRect(850,70,10,510); 
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(850,70,10,510); 
	    
	    //////////////////////////////
	    
		//middle top
		g2d.setColor(Color.BLACK);
		g2d.drawRect(450,170,300,10);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(450,170,300,10);  
	    
	    //middle left
	    g2d.setColor(Color.BLACK);
		g2d.drawRect(450,170,10,300);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(450,170,10,300);  
	    
	    //middle bottom
		g2d.setColor(Color.BLACK);
		g2d.drawRect(450,470,300,10); 
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(450,470,300,10); 
	    
	    //middle right
		g2d.setColor(Color.BLACK);
		g2d.drawRect(750,170,10,310); 
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(750,170,10,310);
	    
	    /////////////////////////////
	    
	    //inner top
  		g2d.setColor(Color.BLACK);
  		g2d.drawRect(530,250,150,10);  
  	    g2d.setColor(Color.BLUE);  
  	    g2d.fillRect(530,250,150,10);  
  	    
  	    //inner left
  	    g2d.setColor(Color.BLACK);
  		g2d.drawRect(530,250,10,150);  
  	    g2d.setColor(Color.BLUE);  
  	    g2d.fillRect(530,250,10,150);  
  	    
  	    //inner bottom
  		g2d.setColor(Color.BLACK);
  		g2d.drawRect(530,400,150,10); 
  	    g2d.setColor(Color.BLUE);  
  	    g2d.fillRect(530,400,150,10); 
  	    
  	    //inner right
  		g2d.setColor(Color.BLACK);
  		g2d.drawRect(670,250,10,160); 
  	    g2d.setColor(Color.BLUE);  
  	    g2d.fillRect(670,250,10,160);
  	    
  	    /////////////////////////////
  	    
  	    //Top connection
  	    g2d.setColor(Color.BLACK);
		g2d.drawRect(600,70,10,190);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(600,70,10,190); 
	    
  	    //left connection
  	    g2d.setColor(Color.BLACK);
		g2d.drawRect(350,320,190,10);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(350,320,190,10);  
	    
	    //bottom connections
		g2d.setColor(Color.BLACK);
		g2d.drawRect(600,400,10,180); 
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(600,400,10,180); 
		
	    //right connection
  	    g2d.setColor(Color.BLACK);
		g2d.drawRect(670,320,190,10);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(670,320,190,10); 
	    
	    ////////////////////////////////

	    
	    //Outer bottom left
	    g2d.setColor(Color.RED);
	    g2d.fillRect(345,565,25,25); 
	    
	     
	    //Outer middle left
	    g2d.fillRect(345,315,25,25); 
	    
	    //Outer top left
	    g2d.fillRect(345,65,25,25); 
	    
	    //Outer top middle
	    g2d.fillRect(595,65,25,25); 
	    
	    //Outer top right
	    g2d.fillRect(845,65,25,25);
	    
	    //Outer middle right
	    g2d.fillRect(845,315,25,25);
	    
	    //Outer bottom right
	    g2d.fillRect(845,560,25,25);
	    
	    //Outer bottom middle
	    g2d.fillRect(595,565,25,25); 
	    
	    //Center Top Left
	    g2d.fillRect(445,165,25,25);
	    
	 	//Center Top middle
	    g2d.fillRect(595,165,25,25);
	    
	    //Center Top right
	    g2d.fillRect(745,165,25,25);
	    
	    //Center middle right
	    g2d.fillRect(745,315,25,25); 
	    
	    //Center bottom right
	    g2d.fillRect(745,465,25,25); 
	    
	    //Center bottom middle
	    g2d.fillRect(595,465,25,25); 
	    
	    //Center bottom left
	    g2d.fillRect(445,465,25,25);
	    
	    //Center middle left
	    g2d.fillRect(445,315,25,25);
	    
	    //Inner middle left
	    g2d.fillRect(523,312,25,25);
	    
	    //Inner top left
  	    g2d.fillRect(524,245,25,25); 
  	    
  	    //Inner bottom left
  	    g2d.fillRect(525,392,25,25);
  	    
  	    //Inner bottom middle
  	    g2d.fillRect(593,395,25,25); 
  	    
  	    //Inner bottom right
  	    g2d.fillRect(665,395,25,25); 
  	    
  	    //Inner middle right
  	    g2d.fillRect(665,315,25,25); 
  	    
  	    //Inner middle top
  	    g2d.fillRect(592,245,25,25); 
  	    
  	    //Inner top right
  	    g2d.fillRect(665,245,25,25); 
  	    
	    
	    
	}
	
}
