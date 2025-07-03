package Arrays;
import java.util.*;

public class Occurance {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 5, 4, 6, 5, 2};
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (visited[i])
                continue;

            int count = 1; // count starts from 1 for a[i]
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}
