package arrays;

import java.util.Scanner;

public class Ex4 {
//    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a. Tiếp theo nhập vào số nguyên là k (0 ≤ k < n).
//
//    Hãy xóa phần tử có chỉ số k ở trong dãy đó. In mảng kết quả ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.

//    Với n = 4, a = [1, 2, 3, 4], k = 1, thì kết quả mong muốn là: "1 3 4 ".
//    Với n = 3, a = [1, 2, 3], k = 2, thì kết quả mong muốn là: "1 2 ".
//    Không thể xóa phần từ trong Array vì các phần tử trong Array là cố định
    public static void main(String[] args) {
        // delete element in array
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = k; i < n-1; i++) {
            arr[i] = arr[i+1];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
