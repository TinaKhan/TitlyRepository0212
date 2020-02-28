package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;


public class UseOfArrayList01 {

	public static void main(String[] args) {
		//Arraylist is a dynamic array. 
		//contains the duplicate values
		//maintains the insertion order
		ArrayList ar=new ArrayList();//non-generic arraylist
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.size());
		ar.add(50);
	    ar.add(50);
	    System.out.println(ar.size());//size of arrylist
	    System.out.println(ar.get(5));//to get the value from an index
	    //To print all the values from index we use loop or iterator
	    for(int i=0;i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
	    //After using the iterator new arraylist is
	    System.out.println("After using iterator the new Arraylist will be ");
	   
		/*
		 * Iterator iterator = ar.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
	    ArrayList<Integer> ar1=new ArrayList<Integer>();
	    ar1.add(100);
	    ar1.add(200);
	    ar1.add(400);
	    System.out.println(ar1.get(2));
	
	//creating employee class object
	    Employee emp1=new Employee("Tom", 11,"QA");
	    Employee emp2=new Employee("Jhon",12,"Dev");
	    Employee emp3=new Employee("Peter",15,"OPS");
    //creating arraylist
	    ArrayList<Employee> ar2=new ArrayList<Employee>();//define generics
	    ar2.add(emp1);
	    ar2.add(emp2);
	    ar2.add(emp3);
	    Iterator<Employee> it = ar2.iterator(); //interface
		while (it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.id);
			System.out.println(emp.dept);
		}
}
}
