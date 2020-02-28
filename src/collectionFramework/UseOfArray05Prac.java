package collectionFramework;

import java.util.Scanner;

public class UseOfArray05Prac {

	public static void main(String[] args) {
		int [] a=new int[8];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter some integer value");
		for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
            System.out.println(a[i]);
		
		
		
		System.out.println("The index value for the 2nd arry is "+a[2]);
		System.out.println("The index value for the 4nd arry is "+a[4]);
		System.out.println("The index value for the 6nd arry is "+a[6]);
		System.out.println("The index value for the 7nd arry is "+a[7]);
		
	}
	}
}


