public class Q3 {
    public static int[] findSecondLargestAndSmallest(int[] a, int n) {
        // Initialize variables to store the smallest and largest
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        // Find the smallest and largest elements
        for (int i = 0; i < n; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        // Find the second smallest and second largest elements
        for (int i = 0; i < n; i++) {
            if (a[i] < secondSmallest && a[i] > smallest) {
                secondSmallest = a[i];
            }
            if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }
        }

        // Return the result as an array
        return new int[] {secondLargest, secondSmallest};
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 2, 3, 4, 5};
        int[] result = findSecondLargestAndSmallest(a, n);
        System.out.println("Second largest: " + result[0]);
        System.out.println("Second smallest: " + result[1]);
    }
}
