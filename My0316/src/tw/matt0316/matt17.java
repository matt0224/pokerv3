package tw.matt0316;

import javax.swing.JOptionPane;

/*
 * �q�Ʀr   String����
 */
public class matt17 {

	public static void main(String[] args) {
		//�W��static��k�u��I�sstatic��k
		// 1. Create Answer 
		String answer = createAnswer(4);  //2.�o��I�s�إߥX�Ӫ���k  �o��p�G�ťլM�X742 //�o���ন���Ǧ^��d
		                                 //�粒d�᧹�i�令4���5��
		System.out.println(answer); 
        //2.start
		for (int i=0; i<10; i++){
			// 2-1. input a number string 
			String guess = JOptionPane.showInputDialog("�q�@�ӼƦr"); 
			
			// 2-2. compare string => result
			String result = checkAB(answer, guess);
			JOptionPane.showMessageDialog(null, result);  //�Ĥ@��()�n��{���^�����Φ^��,�ĤG�ӬO�T��
			
		}

	}
	// method: create a answer     //�̫�o���ন���Ǧ^��d    
	  static String createAnswer(int d){                     //1.�����إߤ@��static��k�B����return�@�Ӧr��
		  int[] poker = new int[d] ; //�u�n012�T�ӥ�0-10          //2.�ƻs�~�P�{���n�����Ʀr����
		                             //�ѼƱq�T�촫��D�^�� �}�C�̭��i�H�O�ܼ�
		  boolean[] check = new boolean[10];  // //0-51���O����  �˥���10��               �������Ʀr�i�H�令10�i�o10�i����
		  boolean  isRepeat; int temp; int count=0;
		  for (int i=0 ; i<poker.length ; i++){     //�~�X�e�T�i
			 do{temp=(int)(Math.random()*10);   //�˥����٬O10
				 count++;
			 }while(check[temp]);
			 
			 // int temp=(int)(Math.random()*52);  //�o�䪺�޿�O��FOR
			                                  
			 // if(check[temp]){
				  //���ƤF
			 // }else   // �_�h
				 poker[i]=temp;      //���ȵM���U���ܦ�TRUE
			     check[temp]=true;
			     
				 
			 }  
		  String ret = ""; 
		  	for(int v:poker) ret += v;       //�M�X�����Ʀr�Ŧr�ꮷ�b�᭱�N���U��retrun
		  	                                   //��X1.2.3�i
		    return ret; 

		                               
		 // return ""+poker[0]+poker[1]+poker[2];  //�]���ƾǾ�Ƭۥ[  "�o��ŧi�ܦr��ҥH�X�{���~����""�令�r��            
	  }                                          //�r��[��ƥ[���=�r��
    // �����X��String result = checkAB(answer, guess)=>?A?B ���פ��q��
	//  method:checkAB(answer, guess)=>?A?B
	  static String checkAB(String a,String g){///���X�@��checkAB����k
		  int A, B; A = B = 0;                          //�Q�ά~�P���覡�g�T�{
		  		for (int i=0; i<g.length(); i++){       //�r�ꪺ���׬O�Q�p��X�Ӫ� �ҥH�n���A��
		  		if (g.charAt(i) == a.charAt(i)){    //g������i�X==a����i�X a++       //�����}�C�@�������ݩ�
		  			A++; 
		 			 }else if(a.indexOf(g.charAt(i))!= -1){  //�_�h  g������i�X�O�_�s�b��a�� -1���s�b
		  				B++; 
		  	} 
		  		} 
		  		return A + "A" + B + "B"; 
                         //�Q�ά~�P���覡�g�T�{
		 
	  }
}
