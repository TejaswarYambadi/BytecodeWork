package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID's = ");
		String [] emp =  new String [10];
		for(int i=0;i<10;i++) {
			emp[i]=sc.next();
		}
		System.out.print(Arrays.toString(emp));
	}

}
