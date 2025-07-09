package arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {12, 45, 67, 23, 89, 45};
        solve(arr);
    }

    public static void solve(int[] arr) {
        int first = arr[0];
        int second = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second != arr[1])
            System.out.println("Second Largest = " + second);
        else
            System.out.println("No second largest element found.");
    }
}
