package tw.matt0316;

public class matt16string {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {97,98,99,100,101,102,103,104};// ���e�� abcdefgh  ���إߤ@��byte 
				String s2 = new String(b1);        //     012
                                                    //�����ǿ�O�qbyte��string
				String s3 = new String(b1, 2, 4);  //�����q���G���׬��|���׬Ocdef
				System.out.println(s1); 
				System.out.println(s2); 
			    System.out.println(s3); 
			    
			    String s4 = "abcdefg";	// �������޸��е������e, �Ҭ������
			    
			    char c1 = s2.charAt(3); 
			    System.out.println(c1); 
			    System.out.println("abcdefgh".charAt(3)); 
                                     //�W���o�]�O�r�ꪫ��ҥH�i�H.�[��k
			     
     
	}

}
