//This code finds out whether a number is palindrome or not.
package flowcontrol;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int rem,temp,rev=0;
		temp=n;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		

	}

}
