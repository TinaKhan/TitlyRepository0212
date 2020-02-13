package collectionFramework;

public class UseOfArray04Draft {

	public static void main(String[] args) {
		char [] a =new char[8];//ask tofael vi
		a[0]='A';
		a[1]='K';
		a[2]='N';
		a[4]='T';
		a[6]='9';
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
