package Arrays;
import java.util.*;
public class MaxEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		int s = sc.nextInt();
		int a[] = new int[s];
		System.out.println("Enter elements in the array = ");
		for (int i = 0;i < s; i++) {
			a[i]=sc.nextInt();
		}
		int m =a[0];
		for(int j=0;j<s;j++) {
			if (a[j]>m) {
				m=a[j];
			}
		}
		System.out.println("Maximum Element = "+m);
		}

}
