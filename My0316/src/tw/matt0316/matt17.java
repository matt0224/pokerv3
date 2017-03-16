package tw.matt0316;

import javax.swing.JOptionPane;

/*
 * 猜數字   String應用
 */
public class matt17 {

	public static void main(String[] args) {
		//上面static方法只能呼叫static方法
		// 1. Create Answer 
		String answer = createAnswer(4);  //2.這邊呼叫建立出來的方法  這邊如果空白映出742 //這邊轉成有傳回值d
		                                 //改完d後完可改成4位或5位
		System.out.println(answer); 
        //2.start
		for (int i=0; i<10; i++){
			// 2-1. input a number string 
			String guess = JOptionPane.showInputDialog("猜一個數字"); 
			
			// 2-2. compare string => result
			String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, result);  //第一個()要對程式回報不用回報,第二個是訊息
			
		}

	}
	// method: create a answer     //最後這邊轉成有傳回值d    
	  static String createAnswer(int d){                     //1.必須建立一個static方法且必須return一個字串
		  int[] poker = new int[d] ; //只要012三個本0-10          //2.複製洗牌程式要不讓數字重複
		                             //參數從三位換成D回傳 陣列裡面可以是變數
		  boolean[] check = new boolean[10];  // //0-51都是假的  樣本數10個               全部的數字可以改成10張發10張測試
		  boolean  isRepeat; int temp; int count=0;
		  for (int i=0 ; i<poker.length ; i++){     //洗出前三張
			 do{temp=(int)(Math.random()*10);   //樣本數還是10
				 count++;
			 }while(check[temp]);
			 
			 // int temp=(int)(Math.random()*52);  //這邊的邏輯是用FOR
			                                  
			 // if(check[temp]){
				  //重複了
			 // }else   // 否則
				 poker[i]=temp;      //給值然後把下面變成TRUE
			     check[temp]=true;
			     
				 
			 }  
		  String ret = ""; 
		  	for(int v:poker) ret += v;       //尋訪全部數字空字串捕在後面代替下面retrun
		  	                                   //抽出1.2.3張
		    return ret; 

		                               
		 // return ""+poker[0]+poker[1]+poker[2];  //因為數學整數相加  "這邊宣告示字串所以出現錯誤必須""改成字串            
	  }                                          //字串加整數加整數=字串
    // 先打出來String result = checkAB(answer, guess)=>?A?B 答案比對猜的
	//  method:checkAB(answer, guess)=>?A?B
	  static String checkAB(String a,String g){///打出一個checkAB的方法
		  int A, B; A = B = 0;                          //利用洗牌的方式寫確認
		  		for (int i=0; i<g.length(); i++){       //字串的長度是被計算出來的 所以要有括號
		  		if (g.charAt(i) == a.charAt(i)){    //g中的第i碼==a中第i碼 a++       //不像陣列一樣類似屬性
		  			A++; 
		 			 }else if(a.indexOf(g.charAt(i))!= -1){  //否則  g中的第i碼是否存在於a中 -1不存在
		  				B++; 
		  	} 
		  		} 
		  		return A + "A" + B + "B"; 
                         //利用洗牌的方式寫確認
		 
	  }
}
