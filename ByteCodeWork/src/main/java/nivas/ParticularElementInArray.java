package nivas;
import java.util.Scanner;
public class ParticularElementInArray {
	public static void main(String[] args) {
		int a[]= new int[]{1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element to find in array = ");
		int b = sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				System.out.println("Element found at "+(i+1)+" position");
				count+=1;
			}
		}
		if (count==0) {
			System.out.println("Element not found");
		}
	}

}
