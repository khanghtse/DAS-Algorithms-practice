package arrays;

import java.util.Scanner;

public class Ex2 {
//    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
//    Hãy thay đổi giá trị của mỗi phần tử thành bình phương của chính nó,
//    sau đó in mảng đó ra màn hình (mỗi phần tử cách nhau bởi một khoảng trắng).

//    Với n = 4 và a = [1, 3, 5, -3] thì kết quả mong muốn là: "1 9 25 9 ".
//    Với n = 4 và a = [1, 2, 3, 4] thì kết quả mong muốn là: "1 4 9 16 ".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < arr.length; j++){
            arr[j] = arr[j] * arr[j];
            System.out.print(arr[j] + " ");
        }
    }
}
