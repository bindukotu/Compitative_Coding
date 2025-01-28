package Bindu1;

import java.util.Arrays;

public class RemoveDuplicateValues {
   public static int removeDuplicates(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int j = 0;
        for (int i = 1; i < a.length; i++) {

            if (a[i] != a[j]) {
                j++;
                a[j] = a[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2,3,3,5,7,2,1};
        int n = removeDuplicates(a);

        // Printing the unique array elements
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
