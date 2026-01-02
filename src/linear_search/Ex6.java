package linear_search;

import java.util.Scanner;

public class Ex6 {
//    Sliding Window
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = sc.nextInt();

        int left = 0;
        int sum = 0;
        boolean found = false;

        for (int right = 0; right < n; right++) {
            sum += a[right];

            // Thu hẹp cửa sổ nếu tổng vượt s
            while (sum > s && left <= right) {
                sum -= a[left];
                left++;
            }

            // Nếu tìm được dãy con đầu tiên
            if (sum == s) {
                for (int i = left; i <= right; i++) {
                    System.out.print(a[i] + " ");
                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }
}
