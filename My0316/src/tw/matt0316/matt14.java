package tw.matt0316;

import java.util.Collections;
import java.util.LinkedList;

public class matt14 {

	public static void main(String[] args) {
		LinkedList<Integer> poker = new LinkedList<>(); 
			for (int i=1; i<=49; i++) poker.add(i); 
			Collections.shuffle(poker);
			//System.out.println(poker);
          //樂透
			  for (int i=0; i<6; i++){ 
				 			System.out.println(poker.get(i));   //這不是物件
				 		} 

	}

}
