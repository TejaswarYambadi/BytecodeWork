public static void solve(int[] arr) {
    // Step 1: Calculate total sum
    int totalSum = 0;
    for (int i = 0; i < arr.length; i++) {
        totalSum += arr[i];
    }

    // Step 2: Loop and compare leftSum with rightSum
    int leftSum = 0;
    for (int i = 0; i < arr.length; i++) {
        int rightSum = totalSum - leftSum - arr[i];

        if (leftSum == rightSum) {
            System.out.println("Equilibrium index found at: " + i);
            return;
        }

        leftSum += arr[i];
    }

    System.out.println("No equilibrium index found.");
}
