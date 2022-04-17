package newPackage;
import java.util.*;
import java.util.Scanner;

public class Addition {
	public static int a,b;
	
	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
		}
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum = " +sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b= sc.nextInt();
		
		add(a,b);
	}

}
