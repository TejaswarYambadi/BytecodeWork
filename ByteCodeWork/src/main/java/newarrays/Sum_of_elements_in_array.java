//Write a java program to find the sum of all elements.
package newarrays;
public class Sum_of_elements_in_array {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		for (int i=0;i<a.length;i++) {
			count+=a[i];
		}
		System.out.println("Total count = "+count);
	}
}
