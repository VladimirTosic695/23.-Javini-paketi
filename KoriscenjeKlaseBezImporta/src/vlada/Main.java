package vlada;

import static java.lang.Math.sqrt;

public class Main {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		double a, b;
		
		System.out.println("Unesite a");
		a = sc.nextDouble();
		System.out.println("Unesite b");
		b = sc.nextDouble();
		
		
		double c = sqrt(a*a + b*b);
		
		System.out.println("C = " + c);
		
		

	}

}
