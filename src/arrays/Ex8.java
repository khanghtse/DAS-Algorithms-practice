package arrays;

import java.util.Scanner;

public class Ex8 {

//    Cho dãy a gồm n số nguyên, và dãy b gồm m số nguyên, cả hai dãy đều được sắp xếp không giảm.
//    Hãy gộp hai dãy thành một dãy c, sao cho dãy c cũng là dãy không giảm. In dãy c ra màn hình,
//    sau mỗi phần tử có đúng một dấy cách.
//    Với a = [1, 3, 4] và b = [1, 2, 4, 5] thì kết quả mong muốn là: "1 1 2 3 4 4 5 ".
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Nhập dãy a
        // Bước 1: Nhập số lượng phần tử n
        int n = sc.nextInt();
        int[] a = new int[n];
        // Bước 2: Nhập từng phần tử của dãy a
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 2. Nhập dãy b
        // Bước 1: Nhập số lượng phần tử m
        int m = sc.nextInt();
        int[] b = new int[m];
        // Bước 2: Nhập từng phần tử của dãy b
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        sc.close(); // Đóng scanner sau khi nhập xong

        // 3. Xử lý gộp và in ra màn hình (Thuật toán 2 con trỏ)
        int i = 0; // Con trỏ cho dãy a
        int j = 0; // Con trỏ cho dãy b

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }

        // In các phần tử còn lại của dãy a (nếu có)
        while (i < n) {
            System.out.print(a[i] + " ");
            i++;
        }

        // In các phần tử còn lại của dãy b (nếu có)
        while (j < m) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
