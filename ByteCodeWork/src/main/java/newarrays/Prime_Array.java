//5.Write a program to print prime numbers in an array.
package newarrays;
public class Prime_Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,88,9};
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			if (n<=1) continue;
			
			int count =0;
			for(int j=2;j<=n/2;j++) {
				if(n%j==0) {
					count++;
					break;
				}
			}
			if(count==0)System.out.print(n+" ");
			
		}
	}

}
