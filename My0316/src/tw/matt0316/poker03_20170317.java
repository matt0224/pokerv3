package tw.matt0316;

public class poker03_20170317 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();  //�B�z�ɶ�����t
		  int[] poker = new int[52] ; //0-51
		  boolean  isRepeat; int temp;
		  for (int i=0 ; i<52 ; i++){
		  int count=0;
			 do{
				 temp = (int)(Math.random()*52);
				
			       isRepeat = false;
				  for(int j=0; j<i;j++){           //�ˬd�e���O�_��I����
					  if (poker[j]==temp){
						  isRepeat = true; //���ƪ� �ܭn����
						  break;        //�o���p�G�S�L�N�O���� ���X
						  //9-16�欰�ˬd����
					  }
				  }
			 }while(isRepeat);
						poker[i]=temp;
						System.out.println(poker[i]);
						
			 }  
			 
			   System.out.println(System.currentTimeMillis()-start);
			  }
			
		  }
    
	



