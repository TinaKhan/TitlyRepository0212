package collectionFramework;

public class UseOfArray02Prac02 {

	public static void main(String[] args) {
		int [] a= new int[5];
		a[0]=7;
		a[1]=14;
		a[2]=21;
		a[3]=28;
		a[4]=35;
		System.out.println("The index value for the first array is :" +a[0]);
		System.out.println("The index value for the first array is :" +a[1]);
		System.out.println("The index value for the first array is :" +a[2]);
		System.out.println("The index value for the first array is :" +a[3]);
		System.out.println("The index value for the first array is :" +a[4]);
		
		//************************************************************
		System.out.println("The total size of array is  :");
		System.out.println("The index value for the first array is :" +a.length);
		//***********************************************************************
		System.out.println("All the index values are displaying below  :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
