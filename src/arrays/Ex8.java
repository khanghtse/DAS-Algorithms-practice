package arrays;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []  a = new int[n];
        int m = sc.nextInt();
        int []  b = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        int[] c = {};

        if (a[0] >= b[0]) {
            c = addElement(c, b[0]);
        } else {
            c = addElement(c, a[0]);
        }

    }

    public static int[] addElement(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value; // thêm vào cuối
        return newArr;
    }
}
