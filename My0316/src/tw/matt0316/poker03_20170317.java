package tw.matt0316;

public class poker03_20170317 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //處理時間的秒速
		  int[] poker = new int[52] ; //0-51
		  boolean  isRepeat; int temp;
		  for (int i=0 ; i<52 ; i++){
		  int count=0;
			 do{
				 temp = (int)(Math.random()*52);
				
			       isRepeat = false;
				  for(int j=0; j<i;j++){           //檢查前面是否跟I重複
					  if (poker[j]==temp){
						  isRepeat = true; //重複的 話要重做
						  break;        //這關如果沒過就是錯的 跳出
						  //9-16行為檢查機制
					  }
				  }
			 }while(isRepeat);
						poker[i]=temp;
						System.out.println(poker[i]);
						
			 }  
			 
			   System.out.println(System.currentTimeMillis()-start);
			  }
			
		  }
    
	



