import java.util.Scanner;

public class firstOrder {

	public static void main(String[] args) {
		double s1, c, g, sn, n, sg;
		
		//scanner input
		Scanner s = new Scanner(System.in);
		
		//split
		s.next();
		s1 = s.nextDouble();
		s.next();
		c = s.nextDouble();
		s.next();
		g = s.nextDouble();
		
		System.out.println("S(n) = " + c + "^(n-1) * " + s1 + " + sigma(" + c + ")^(n-i) * " + g + ")");
		System.out.println("S(1) = " + s1);
		//formula
		for (int i = 1; i<10; i++) {
			//sigma formula
			sg = 0;
			for (int j = 0; j<i; j++) {
				sg = sg + Math.pow(c, j);
			}
			sn = (Math.pow(c, i)* s1) + (sg * g);	
			System.out.println("S(" + (i+1) + ") = " + sn);
		}
	}
}
