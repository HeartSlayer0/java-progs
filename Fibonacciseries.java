package prac;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a=-1;
		int b=1;
		int c=1;
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
