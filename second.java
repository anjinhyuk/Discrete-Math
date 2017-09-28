import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		double s1, s2, c1, c2, sn;
		double r1, r2, p, q;
		
		//Scanner for input
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
//		String line1 = s.nextLine();
//		String[] tokens = line1.split(" ");
//		double S1 = Double.parseDouble(tokens[1]);
		
		//split
		s.next();
		s1 = s.nextDouble();
		s.next();
		s2 = s.nextDouble();
		s.next();
		c1 = s.nextDouble();
		s.next();
		c2 = s.nextDouble();
		
		//formula
		r1 = (c1 + Math.sqrt((c1*c1)+4*c2)) / 2;
		r2 = (c1 - Math.sqrt((c1*c1)+4*c2)) / 2;
		
		//formula for r1=r2
		if (r1 == r2) {
			p = s1;
			q = ((s2-(s1*r1))/r1);
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
			System.out.println("p = " + p);
			System.out.println("q = " + q);
			System.out.println("S(n) = " + "(" + p + ")(" + r1 + ")^(n-1) + (" + q + ")(" + r2 + ")^(n-1)");
			System.out.println("S(1) = " + s1);
			System.out.println("S(2) = " + s2);
			
			for (int i=2; i<10; i++) {
				sn=p*Math.pow(r1, i) + q*i*Math.pow(r1, i);
				System.out.println("S(" + (i+1) + ") = " + sn);
			}
		//normal formula
		} else {
			q = ((s1*r1)-s2) / (r1-r2);
			p = s1 - q;
			
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
			System.out.println("p = " + p);
			System.out.println("q = " + q);
			System.out.println("S(n) = " + "(" + p + ")(" + r1 + ")^(n-1) + (" + q + ")(" + r2 + ")^(n-1)");
			System.out.println("S(1) = " + s1);
			System.out.println("S(2) = " + s2);
			
			for (int i=2; i<10; i++) {
				sn = p*Math.pow(r1, i) + q*Math.pow(r2, i);
				System.out.println("S(" + (i+1) + ") = " + sn);
			}
		}
	}
}
