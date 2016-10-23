package lifegame_package;

import java.awt.Graphics;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;    
import javax.swing.JPanel;  
import javax.swing.Timer;  

public class Map extends JPanel {
	private final int radius = 20;  
	  
	 private final char WORLD_MAP_NONE = 'N';  
	  
	 private final char WORLD_MAP_ALIVE = 'A';  	
		 
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

    private Timer timer;  //动画帧之间的延时，每秒60帧   
	private final int DELAY_TIME = 3000;  
	   
	    
	 public Map() {  
	        this.startAnimation();  
	    } 
	
	 public void paintComponent(Graphics g) {  
	        super.paintComponent(g);	    	
	    	for (int i = 0; i < nextStatus.length; i++) {  
	            for (int j = 0; j < nextStatus[0].length; j++) { 
	            	if(nextStatus[i][j]==WORLD_MAP_ALIVE)
	            	{
	            		g.fillOval(j*radius,i*radius , radius, radius);
	            	
	            	}else {  
	            		g.drawOval(j*radius,i*radius , radius, radius);
	            	
	                }  
	                   
	            }    	
	    	}
	 }
	   
	public void setNextStatus(char [][] nextStatus){
		    	for(int i = 0;i<10;i++){
		    		for(int j=0;j<10;j++){
		    			this.nextStatus[i][j] = nextStatus[i][j];
		    		}
				}
		    
	}
	
	    public void changeCellStatus() {  
	        for (int row = 0; row < nextStatus.length; row++) {  
	            for (int col = 0; col < nextStatus[row].length; col++) {  
	  
	                switch (neighborsCount(row, col)) {  
	                case 0:  
	                case 1:  
	                case 4:  
	                case 5:  
	                case 6:  
	                case 7:  
	                case 8:  
	                    nextStatus[row][col] = WORLD_MAP_NONE;  
	                    break;  
	                case 2:  
	                    nextStatus[row][col] = tempStatus[row][col];  
	                    break;  
	                case 3:  
	                    nextStatus[row][col] = WORLD_MAP_ALIVE;  
	                    break;  
	                }  
	            }  
	        }  
	      copyMap();  
	    }  
	    
/** * 获取当前坐标点临近细胞个数 */  
	    public void setTempStatus(char [][] tempStatus){
	    	for(int i = 0;i<10;i++){
	    		for(int j=0;j<10;j++){
	    			this.tempStatus[i][j] = tempStatus[i][j];
	    		}
			}
	    }
	   public int neighborsCount(int row, int col) {  
	        int count = 0, r = 0, c = 0;  
	  
	        for (r = row - 1; r <= row + 1; r++) {  
	            for (c = col - 1; c <= col + 1; c++) {  
	                if (r < 0 || r >= tempStatus.length || c < 0  
	                        || c >= tempStatus[0].length) {  
	                    continue;  
	                }  
	                if (tempStatus[r][c] == WORLD_MAP_ALIVE) {  
	                    count++;  
	                }  
	            }  
	        }  
	        if (tempStatus[row][col] == WORLD_MAP_ALIVE) {  
	            count--;  
	        }  
	        return count;  
	    }  
	    /** 
	     * 开始动画 
	     *  
	         */  
	    private void startAnimation() {  
	        for (int row = 0; row < Square.length; row++) {  
	            for (int col = 0; col < Square[0].length; col++) {  
	                nextStatus[row][col] = Square[row][col];  
	                tempStatus[row][col] = Square[row][col];  
	            }  
	        }  
	        // 创建计时器  
	        timer = new Timer(DELAY_TIME, new ActionListener() 
	        {   @Override  
	            public void actionPerformed(ActionEvent e) {  
	                changeCellStatus();  
	                repaint();  
	            }  
	        });  
	        // 开启计时器  
	        timer.start();  
	    }  
	  
	    /** 
	     * 复制地图  */  
	   private void copyMap() {  
	        for (int row = 0; row < nextStatus.length; row++) {  
	            for (int col = 0; col < nextStatus[row].length; col++) {  
	                tempStatus[row][col] = nextStatus[row][col];  
	            }  
	        }  
	    }  
	}  
