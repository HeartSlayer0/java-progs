package prac;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,6,2,5,6,7,9,1,2,3,0};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}	
			}
		}
		System.out.println(Arrays.toString(a));
	
	}

}
