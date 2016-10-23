package lifegame_package;

import javax.swing.JFrame;  




/** 
 * 生命游戏 
 *  
 */  
  
public class MyLifeGame extends JFrame{  
  
      
    private static final long serialVersionUID = -1660060555234651445L;  
  
    MyLifeGame(){  
        this.setSize(510,410);  
        this.setTitle("生命游戏[MyLifeGame]DEMO");  
        this.add(new Map());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
    }  
      
    public static void main(String[] args){  
        MyLifeGame game = new MyLifeGame();  
        game.setVisible(true);  
    }  
  
}

