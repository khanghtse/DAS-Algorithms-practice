package linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // binary search
        int low = 0;
        int high = a.length - 1;
        Arrays.sort(a);
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == x) {
                System.out.println(mid);
            } else if (a[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(-1);
    }
}
