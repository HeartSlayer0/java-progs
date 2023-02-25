package prac;

public class Patternprogramscollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("new pattern 1");
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		System.out.println("new pattern 2");
		for(int row=0;row<5;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("new pattern 3");
		String str="*";
		for(int i=0;i<=7;i++) {
			str=str+i;
			System.out.println(str);
		}
	}

}
