//6.Write a program to merge two arrays.
package newarrays;
public class Merge_Arrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		int c[] = new int[a.length+b.length];
		for(int j=0;j<a.length;j++) {
			c[j]=a[j];
		}
		for(int i =0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}//