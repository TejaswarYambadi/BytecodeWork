//3.Count no of odd and even elements in an array.
package newarrays;
public class Even_Odd_Count {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int ec = 0,oc=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)ec++;
			else {
				oc++;
			}
		}
		System.out.println("Even Count = "+ec);
		System.out.println("Odd COunt = "+oc);
	}

}
