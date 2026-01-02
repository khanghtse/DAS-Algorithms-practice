package linear_search;

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

        boolean check = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println(i);
                check = false;
                break;
            }
        }

        if (check) System.out.println("-1");
    }
}
