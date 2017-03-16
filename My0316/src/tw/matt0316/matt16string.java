package tw.matt0316;

public class matt16string {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {97,98,99,100,101,102,103,104};// 內容為 abcdefgh  先建立一個byte 
				String s2 = new String(b1);        //     012
                                                    //網路傳輸是從byte轉string
				String s3 = new String(b1, 2, 4);  //偏移量為二長度為四答案是cdef
				System.out.println(s1); 
				System.out.println(s2); 
			    System.out.println(s3); 
			    
			    String s4 = "abcdefg";	// 任何雙引號標註的內容, 皆為物件實
			    
			    char c1 = s2.charAt(3); 
			    System.out.println(c1); 
			    System.out.println("abcdefgh".charAt(3)); 
                                     //上面這也是字串物件所以可以.加方法
			     
     
	}

}
