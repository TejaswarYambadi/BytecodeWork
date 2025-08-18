//2.Write a program to print even elements in a given array
package newarrays;
public class Even_Elements_Array {
	public static void main(String[]args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)System.out.print(a[i]+" ");continue;
		}
	}
}
