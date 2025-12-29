package linear_search;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Tìm vị trí phần tử nhỏ nhất đầu tiên
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        // Tìm vị trí phần tử lớn nhất cuối cùng
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[maxIndex]) {
                maxIndex = i;
            }
        }

        // Hoán đổi
        int temp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = temp;

        // In kết quả
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
