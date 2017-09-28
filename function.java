import java.util.ArrayList;
import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		//Scan and put values into arraylist
		Scanner s = new Scanner(System.in);
		
		String line1 = s.nextLine();
		String line2 = s.nextLine();
		String line3 = s.nextLine();
		s.close();
		String[] domain = line1.split(" ");
		String[] codomain = line2.split(" ");
		String[] relation = line3.split(" ");
		ArrayList <String> range1 = new ArrayList<String>();
		ArrayList <String> range2 = new ArrayList<String>();
		ArrayList <Integer> domcount = new ArrayList<Integer>();
		ArrayList <Integer> codcount = new ArrayList<Integer>();
		String check2;
		String check3;
		String check4;
		
		//print domain
		System.out.print("DOMAIN: {");
		for (int i = 0; i < (domain.length-1); i++ ) {
			System.out.print(domain[i]+", ");
		}
		int x = domain.length-1;
		System.out.println(domain[x] + "}");
		
		//print codomain
		System.out.print("CODOMAIN: {");
		for (int i = 0; i < (codomain.length-1); i++ ) {
			System.out.print(codomain[i]+", ");
		}
		int y = codomain.length-1;
		System.out.println(codomain[y] + "}");
		
		//print relation
		System.out.print("RELATION: {");
		int z = relation.length;
		for (int i = 0;i < z-1 ;i++) {
			if (i%2 == 0) {
				range1.add(relation[i]);
				System.out.print("("+relation[i]+", ");
			} else {
				range2.add(relation[i]);
				System.out.print(relation[i]+"), ");
			}
		}
		int t = z-1;
		range2.add(relation[t]);
		System.out.println(relation[t] + ")}");
		
		//function checks : domcount is the count of matching values in domain
		int a = domain.length;
		for (String ya1 : domain) {
			int count = 0;
			for (String ya2 : range1) {
				if ((ya1).equals(ya2)) {
					count++;
				}
			}
			domcount.add(count);
		}
		
		//function checks : codcount is the count of matching values in domain
		for (String ya1 : codomain) {
			int count = 0;
			for (String ya2 : range2) {
				if ((ya1).equals(ya2)) {
					count++;
				}
			}
			codcount.add(count);
		}

		//if the number of matching value is the same with the domain length then it is a function
		int count = 0;
		for (Integer ch1 : domcount) {
			if (ch1 == 1) {
				count++;
			}
		}
		
		//function check.
		if ((int)count != a) {
			System.out.println("It is *not* a function.");
		} else {
			System.out.println("It is a function.");
			
			//on to function
			int con1 = 0;
			int con2 = 0;
			for (Integer ya1 : codcount) {
				if (ya1 == 0) {
					con1++;
				}
			}
			if (con1 > 0) {
				check2 = "*not* ";
			} else {
				check2 = "";
			}
			System.out.println("It is " + check2 + "onto.");
			
			//one to one check
			for (Integer ya1 : codcount) {
				if (ya1 >= 2) {
					con2++;
				}
			}
			if (con2 > 0) {
				check3 = "*not* ";
			} else {
				check3 = "";
			}
			System.out.println("It is " + check3 + "one-to-one.");
			
			//bijection check
			if (check2 == "" && check3 == "") {
				check4 = "";
			} else {
				check4 = "*not* ";
			}
			System.out.println("It is " + check4 + "a bijection.");	
		}
	}
}
