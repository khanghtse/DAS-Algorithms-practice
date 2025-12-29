package linear_search;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                if (a[i] % 2 != 0) {
                    System.out.print(a[i] + " ");
                    check = false;
                }
            }
        }

        if (check) System.out.println("NULL");
    }
}
