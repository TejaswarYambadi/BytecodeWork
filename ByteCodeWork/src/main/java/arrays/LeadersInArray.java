package arrays;
public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        solve(arr);
    }

    public static void solve(int[] arr) {
        // Step 1: Start from rightmost element
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        
        // Step 2: Print the rightmost element (it's always a leader)
        System.out.print("Leaders: " + maxFromRight + " ");

        // Step 3: Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
