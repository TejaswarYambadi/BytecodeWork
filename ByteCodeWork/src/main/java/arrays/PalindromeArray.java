package arrays;

public class PalindromeArray {
	static boolean isPalindrome = true;
	public static void main(String[]args) {
		int[]arr= {1,2,3,2,1};
		
		solve(arr);
	}
	public static void solve(int[] arr) {
		for(int i=1;i<arr.length/2;i++) {
			if(arr[i] != arr[arr.length-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome)System.out.println("Palindromed Array");
		else System.out.println("Not a Palindromed Array");
	}
}
