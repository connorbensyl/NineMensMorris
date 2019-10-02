package sprint1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Rectangles extends JPanel {
	
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
  	    
  	    //Top connection
  	    g2d.setColor(Color.BLACK);
		g2d.drawRect(600,70,10,190);  
	    g2d.setColor(Color.BLUE);  
	    g2d.fillRect(600,70,10,190);  
		
	}
	
}