public class Arrays {
    
    //  linear search
    public static void linearSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println("Key found at index " + i);
                return;
            }
        }
        System.out.println("Key is not in the array");
        return;
    }

    // find largest and smallest
    public static void findLargestSmallest(int a[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (largest < a[i])
                largest = a[i];
            if (smallest > a[i])
                smallest = a[i];
        }
        System.out.println("largest of array " + largest);
        System.out.println("smallest of array " + smallest);
    }
    
    // binary search
    public static void binarySearch(int[] s, int key) {
        int start = 0;
        int end = s.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // To prevent overflow
            if (s[mid] == key) {
                System.out.println("Key found at index: " + mid);
                return;
            } else if (s[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Key is not in the array.");
    }

    // reverse the array
    public static void reverse(int[] a) {
        int n = a.length;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[--n];
            a[n] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

    }
    
    // pairs in an array
    public static void pairs(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")");
            }
        }
    }

    // print subarray
    public static void subarrays(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k] + ", ");
                }
                System.out.print("]");
            }
        }
    }

    // print max Subarray sum
    public static void maxSumSubarray(int a[]) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];
                }
                if (max < sum)
                    max = sum;
            }
        }
        System.out.println();
        System.out.println(max);
    }

    public static void main(String args[]) {
        int a[] = { 2, 8, 4, 2, 1 };
        linearSearch(a, 8);
        findLargestSmallest(a);
        int s[] = { 3, 4, 6, 8, 10 };
        binarySearch(s, 8);
        // reverse(a);
        pairs(a);
        subarrays(a);
        int b[] = { 2,4,6,8,10 };
        maxSumSubarray(b);
    }
}