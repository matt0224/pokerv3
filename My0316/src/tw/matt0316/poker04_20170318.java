package tw.matt0316;

public class poker04_20170318 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //�B�z�ɶ�����t
		   //�~�P
		  int[] poker = new int[52] ; //0-51
		  boolean[] check = new boolean[52];  // //0-51���O����                         �������Ʀr�i�H�令10�i�o10�i����
		  boolean  isRepeat; int temp; int count=0;
		  for (int i=0 ; i<52 ; i++){       
			 do{temp=(int)(Math.random()*52);
				 count++;
			 }while(check[temp]);
			 
			 // int temp=(int)(Math.random()*52);  //�o�䪺�޿�O��FOR
			                                  
			 // if(check[temp]){
				  //���ƤF
			 // }else   // �_�h
				 poker[i]=temp;      //���ȵM���U���ܦ�TRUE
			     check[temp]=true;
			     System.out.println(temp);
				 
			 }  
		  
			 //�o�P 4�a �@13�i�P
		     int[][]player= new int[4][13];
		//     for (card:player){                //��for each ���n�Χﴶ�q��
		   // 	 player[?][?]=card;
		     for(int i=0 ;i<poker.length;i++){
		    	 player[i%4][i/4]=poker[i];
		    			 //""�W�������t�I�Ʊqpoker����player""�ξ��mod����٬O���
		    	 
		     }
		        //�o���ݩ���� �Ĥ@�a
		     for(int v : player[1]){
		    	 System.out.println(v);
		     }
		       System.out.println("----");
		        //""�o���ݩ��u�P""
		       String[] suits = {"�®�","����","���","����"};  // suit[0]�®� ���@�U�n�I�s
		       String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10","J ","Q ","K "}; // values[0]
		       for(int[] cards:player){    
		    	   for(int card:cards){                  
		    		   System.out.println(suits[card/13]+values[card%13]); //�������ӥ[�ܭ��n
//		    	for(int[] cards:player){           
//				    for(int card:cards){                  �W���o��o�P�O�qforeach�t�ܦӨ�
//				    	System.out.println(card);
		    	   }
		       }
		       System.out.println("----");
		       System.out.println("----");
		       
		     
			  // System.out.println("�Ӯ�"+(+System.currentTimeMillis()-start));
			  // System.out.println(count+"�X��");
			  }
			
		  }
    
	



