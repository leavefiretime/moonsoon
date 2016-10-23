package lifegame;

import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;    
import javax.swing.JPanel;  
import javax.swing.Timer;  


public class Map extends JPanel {
	 private final int width = 20;  
	  
	    private final int height = 20;  
	  
	    private final char WORLD_MAP_NONE = 'N';  
	  
	    private final char WORLD_MAP_ALIVE = 'A';  	
		 
	    private Timer timer; 
	
	    private final char[][] Square={
	    	
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','N','N','N','N','N'},		
		{'N','N','N','N','N','N','N','N','N','N','N','A','N','A','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','A','N','N','N','A','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','A','N','N','N','N','N','A','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N'},		
		{'N','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','A','N','N','N','N','N','A','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','A','N','N','N','A','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','A','N','A','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','A','N','N','N','N','N','N','N','N','N','N','N','N'},		
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		{'N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N','N'},
		};
		

	    private char[][] nextStatus = new char[Square.length][Square[0].length];  
	    
	    private char[][] tempStatus = new char[Square.length][Square[0].length];
	    
	    public void paintComponent(Graphics g) {  
	        super.paintComponent(g);	    	
	    	for (int i = 0; i < Square.length; i++) {  
	            for (int j = 0; j < Square[0].length; j++) {  
	    	
	    	
	    }
	}

   
    
	
	
	

}
