package lifegame_package;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MapTest {
	private static Map map = new Map();
	@Before
	
	public void testNeighborsCount() {

		char[][] tempStatus = {
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'},
				{'N','A','N','A','N','A','N','A','N','A'}
		                        };
				
		
		map.setTempStatus(tempStatus);
		
		int count = map.neighborsCount(2,2);
		
        assertEquals(7,count);
	
	}
public void testChangeCellStatus() {

	/*char[][] nextStatus = {
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'},
			{'N','A','N','A','N','A','N','A','N','A'}
	                        };	                    
	map.setNextStatus(nextStatus);
	map.changeCellStatus();  
	map.repaint();  

	char[][] changedStatus;
	for (int i = 0; i < 10; i++) {  
          for (int j = 0; j< 10; j++) {       
			changedStatus[i][j] = nextStatus[i][j];
          }        
	}
char[][] expectStatus={
		{'N','N','N','N','N','N','N','N','N','N'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'A','A','N','A','N','A','N','A','N','A'},
		{'N','N','N','N','N','N','N','N','N','N'},
                        };	
for (int i = 0; i < 10; i++) {  
    for (int j = 0; j< 10; j++) {  
 assertEquals(expectStatus[i][j] ,changedStatus[i][j]);
      }
     }*/
}
}