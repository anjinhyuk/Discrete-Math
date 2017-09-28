import java.util.Scanner;


public class modular {

	public static String encrypt(String msg, int key) {   
		//default 
		String encrypted = "";
		//check codes
	    for(int i = 0; i < msg.length(); i++) {
	        int code = msg.charAt(i); 
	        if (Character.isUpperCase(code)){
	            code = code + (key % 26);
	            //if the value is greater than 26
	            if (code > 'Z')
	            code = code - 26;
	        }
	        //from numeric value to character
	        encrypted += (char) code;
	    }
	    return encrypted;
	 }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//input
		String line = s.nextLine();
		Integer key = s.nextInt();
		s.close();
		//printing result
		String result = encrypt(line, key);
		System.out.println(result);
		System.out.println(key);
	}
	

}
