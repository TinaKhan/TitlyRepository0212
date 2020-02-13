package collectionFramework;

public class UseOfArray04Main {

	public static void main(String[] args) {
		char [] a =new char[8];//ask tofael vi
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[4]=40;
		a[6]=60;
		System.out.println("Printing single index value "+a[0]);
		System.out.println("Printing single index value "+a[1]);
		System.out.println("Printing single index value "+a[2]);
		System.out.println("Printing single index value "+a[4]);
		System.out.println("Printing single index value "+a[5]);
		System.out.println("Printing single index value "+a.length);//it will show the total number of size
		System.out.println("Printing single index value "+(a.length-2));//it will deduct 2 from total number of size of array
		//**********************************************************************************
		System.out.println("Printing all index value of Array a");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
		}
}
