package arrays;

import java.util.Scanner;

public class Ex5 {

//    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
//    Hãy in lần lượt các số nguyên tố có trong dãy a ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
//        (Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó. Số a được gọi là ước của b nếu b chia hết cho a).
//    Biết rằng dãy sẽ có ít nhất một số nguyên tố.

//    Với n = 4, a = [1, 2, 3, 4] thì kết quả mong muốn là: "2 3 ".
//    Với n = 3, a = [7, 2, 3] thì kết quả mong muốn là: "7 2 3 ".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
