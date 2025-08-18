package newarrays;
public class Reverse_Array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int temp[] = new int[a.length];
        int k = 0;
        for (int j = a.length - 1; j >= 0; j--) {
            temp[k] = a[j];
            k++;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
