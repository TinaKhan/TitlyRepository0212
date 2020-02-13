package collectionFramework;

public class UseOfArray03 {

	public static void main(String[] args) {
		String [] a =new String[7];
		a[0]="Tanzina";
		a[1]="Nishat";
		a[2]="Titly";
		a[3]="Monjira";
		a[4]="Coockie";
		
		System.out.println("Single index value: " + a[0]);
		System.out.println("Single index value: " + a[1]);
		System.out.println("Single index value: " + a[2]);
		System.out.println("Single index value: " + a[3]);
		System.out.println("Single index value: " + a.length);
		System.out.println("Single index value: " + (a.length-1));
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Single index value: " + a[i]);
		}
		

	}

}
