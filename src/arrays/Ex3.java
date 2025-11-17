package arrays;

import java.util.Scanner;


public class Ex3 {

//    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
//    Tiếp theo nhập vào hai số nguyên là k và x (0 ≤ k ≤ n).
//
//    Hãy chèn phần tử có giá trị x vào dãy a, ở trước phần tử có chỉ số k và sau phần tử có chỉ số k-1.
//    In mảng kết quả ra màn hình, mỗi số cách nhau bởi một khoảng trắng.

//    Với n = 4, a = [1, 2, 3, 4], k = 1, x = 10 thì kết quả mong muốn là: "1 10 2 3 4 ".


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]  = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int x = sc.nextInt();

        int[] newArr = new int[n+1];

        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        newArr[k] = x;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}