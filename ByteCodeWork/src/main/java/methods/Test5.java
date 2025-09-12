package methods;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			       int arr1[] = { 11, 22, 33 }; 
			         int arr2[] = { 11, 22, 33, 44, 55 }; 
			         int ptr[]= {}; 
			        ptr = arr1; //11,22,33
			        arr1 = arr2; //11,22,33,44,55
			        arr2 = ptr; //11,22,33
			        System.out.print(arr1.length + " "); //5
			        System.out.println(arr2.length); //3
			    } 
			} 
	


