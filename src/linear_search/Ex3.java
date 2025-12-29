package linear_search;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int count = 0;
        for (int i: a) {
            if (i == x) {
                count++;
            }
        }

        System.out.println(count);
    }
}
