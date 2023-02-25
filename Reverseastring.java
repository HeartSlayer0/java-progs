package prac;

import java.util.Scanner;

public class Reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String str=scan.nextLine();
		System.out.println("Entered string is: "+str);
		char arr[]=str.toCharArray();
		System.out.print("Reverse string is: ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(""+arr[i]);
		}
	}

}
