package prac;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1111";
		char arr[]=str.toCharArray();
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+arr[i];
		}
		if(str.equals(str1)) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
	}

}
