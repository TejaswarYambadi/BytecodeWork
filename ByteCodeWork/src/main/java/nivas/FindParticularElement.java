package nivas;
import java.util.Scanner;
public class FindParticularElement {
	public static void main(String[] args) {
		int a [] = new int[] {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find = ");
		int b = sc.nextInt();
		boolean found = false;
		for(int i =0;i<a.length;i++) {

			if (a[i]==b)found = true;
			
		}
		if(found)System.out.println("Element found");else{
			System.out.println("Element not found");
		}
	}
	
}
