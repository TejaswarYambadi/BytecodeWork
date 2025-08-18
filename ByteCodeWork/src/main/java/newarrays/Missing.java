//11.program to find missing element from the array?
package newarrays;
public class Missing {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,9};
		int c = a.length;
		int dummy_count=0;
		int final_count=(c*(c+1))/2;
		for(int i=0;i<a.length;i++) {
			dummy_count+=a[i];
		}
		System.out.println(final_count-dummy_count);
	}
}
