package tw.matt0316;

public class poker04_20170318 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //處理時間的秒速
		   //洗牌
		  int[] poker = new int[52] ; //0-51
		  boolean[] check = new boolean[52];  // //0-51都是假的                         全部的數字可以改成10張發10張測試
		  boolean  isRepeat; int temp; int count=0;
		  for (int i=0 ; i<52 ; i++){       
			 do{temp=(int)(Math.random()*52);
				 count++;
			 }while(check[temp]);
			 
			 // int temp=(int)(Math.random()*52);  //這邊的邏輯是用FOR
			                                  
			 // if(check[temp]){
				  //重複了
			 // }else   // 否則
				 poker[i]=temp;      //給值然後把下面變成TRUE
			     check[temp]=true;
			     System.out.println(temp);
				 
			 }  
		  
			 //發牌 4家 共13張牌
		     int[][]player= new int[4][13];
		//     for (card:player){                //用for each 不好用改普通的
		   // 	 player[?][?]=card;
		     for(int i=0 ;i<poker.length;i++){
		    	 player[i%4][i/4]=poker[i];
		    			 //""上面式分配點數從poker分給player""用整數mod整數還是整數
		    	 
		     }
		        //這邊屬於驗算 第一家
		     for(int v : player[1]){
		    	 System.out.println(v);
		     }
		       System.out.println("----");
		        //""這邊屬於攤牌""
		       String[] suits = {"黑桃","紅心","方塊","梅花"};  // suit[0]黑桃 等一下要呼叫
		       String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "}; // values[0]
		       for(int[] cards:player){    
		    	   for(int card:cards){                  
		    		   System.out.println(suits[card/13]+values[card%13]); //中間有個加很重要
//		    	for(int[] cards:player){           
//				    for(int card:cards){                  上面這行發牌是從foreach演變而來
//				    	System.out.println(card);
		    	   }
		       }
		       System.out.println("----");
		       System.out.println("----");
		       
		     
			  // System.out.println("耗時"+(+System.currentTimeMillis()-start));
			  // System.out.println(count+"幾次");
			  }
			
		  }
    
	



