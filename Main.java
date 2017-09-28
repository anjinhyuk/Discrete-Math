import java.util.Scanner;


public class Main {
	public Main() {
		Scanner s = new Scanner(System.in);
		String l1 = s.nextLine();
		String[] line1 = l1.split(" ");
		int numVar = line1.length -1;
		//calculate how many time the loof has to run
		int numRows = (int) Math.pow(2, numVar);
		String l2 = s.nextLine();
		System.out.println("");
		
		int plus =0;
		for (int i=0; i<numRows; i++) {
			String cal = s.nextLine();
			String[] calLine = cal.split(" ");
			int count = calLine.length-1;
			//bring the output
			String check = calLine[count];
			//check the output is 1
			if(check.equals("1")) {
				if (plus > 0) {
					System.out.print("+ ");
				}
				plus++;
				for(int j=0; j<count; j++) {
					String result1 = calLine[j];
					String result2 = line1[j];
					System.out.print(result2);
					if (result1.equals("0")) {
						System.out.print("'");
					}
					System.out.print(" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
