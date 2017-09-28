import java.util.Scanner;

public class cnf {
	public cnf() {
		Scanner s = new Scanner(System.in);
		String l1 = s.nextLine();
		String[] line1 = l1.split(" ");
		int numVar = line1.length -1;
		//calculate how many time the loof has to run
		int numRows = (int) Math.pow(2, numVar);
		String l2 = s.nextLine();
		System.out.println("");
		
		
		for (int i=0; i<numRows; i++) {
			String cal = s.nextLine();
			String[] calLine = cal.split(" ");
			int count = calLine.length-1;
			//bring the output
			String check = calLine[count];
			//check if the out is 0
			int plus = 0;
			if(check.equals("0")) {
				System.out.print("(");
				for(int j=0; j<count; j++) {
					plus++;
					String result1 = calLine[j];
					String result2 = line1[j];
					System.out.print(result2);
					if (result1.equals("1")) {
						System.out.print("'");
					}
					
					if(plus<count){	
						System.out.print(" + ");
					}
					
				}
				System.out.print(")");
			}
		}		
	}
	
	public static void main(String[] args) {
		new cnf();

	}

}

