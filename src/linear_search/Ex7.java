package linear_search;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        boolean check = true;

        for (int i = 0; i < n; i++) {
            if(a[i] == s) {
                System.out.println(i);
                check = false;
                break;
            }
        }

        if(check) System.out.println("-1");
    }
}
