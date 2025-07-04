package Assignements;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		for(int k=0;k<3;k++) {
			int temp = arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]= temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
