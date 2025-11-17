package arrays;

import java.util.Scanner;

public class Ex1 {

//    Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
//    Hãy đưa ra một số nguyên là tổng tất cả các phần tử trong dãy đó.
//   Với n = 5 và a = [1, 3, 5, -3, 0] thì kết quả mong muốn là 6
//   Với n = 4 và a = [1, 2, 3, 4] thì kết quả mong muốn là 10.
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
        }
        System.out.println(sum);
        }
    }
