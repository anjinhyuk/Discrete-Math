import java.util.Scanner;


public class modular3 {

	 public static String decrypt(String msg, int key) {
		 //default value
		 String decrypted = "";
		//check codes
	    for(int i = 0; i < msg.length(); i++) {
	        int code = msg.charAt(i);
	        System.out.println(code);
	        if (Character.isUpperCase(code)) {
	            code = code - (key % 26);
	          //if the value is less than 0
	            if (code < 'A')
	            code = code + 26;
	        }
	      //from numeric value to character
	        decrypted += (char) code;
	    }
     return decrypted;
	 }
	 
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			//input
			String line = s.nextLine();
			s.close();
			//looping all the result printing
			int key=0;
			System.out.println("ciphertext: " + line);
			for (int i =0; i <26; i++) {
				String result = decrypt(line, key);
				System.out.print("key: " + key);
				System.out.println(" decodes to: " + result);
				key++;
			}
		}
}
