package newPackage;

import java.util.Scanner;

public class Subtraction {
	public static int a,b;
	
	public Subtraction(int a, int b) {
		this.a=a;
		this.b=b;
		}
	public static void subtract(int a, int b) {
		int diff = a - b;
		System.out.println("Difference = " +diff);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		
		subtract(a,b);
	}

}
