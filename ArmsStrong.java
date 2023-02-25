package prac;

public class ArmsStrong {
	public static void main(String[] args) {
	int n=153;
	int d1,d2,d3;
	int temp=n;
	d3=temp%10;
	temp=temp/10;
	d2=temp%10;
	temp=temp/10;
	d1=temp%10;
	int arm=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
	if(n==arm) {
		System.out.println(n+" is a armstrong");
	}
	else {
		System.out.println(n+" is not an armstrong");
	}
}
}