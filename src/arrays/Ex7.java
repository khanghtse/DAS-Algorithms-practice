package arrays;

import java.util.Scanner;

public class Ex7 {

//    Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số a.
//    Hãy kiểm tra xem dãy a có phải là dãy đơn điệu hay không, trả về "YES" nếu có, "NO" nếu không.
//    Một dãy đơn điệu khi nó là dãy số tăng (a[i] > a[i-1]), hoặc dãy số giảm (a[i] < a[i-1]).
//    Với a = [1, 2, 3, 4, 5] thì kết quả mong muốn là "YES".
//    Với a = [1, 2, 4, 3, -2] thì kết quả mong muốn là "NO".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean th1 = true; // kt phan tu trong mang tang dan
        boolean th2 = true; // kt phan tu trong mang giam dan
        for(int i = 1; i < n; i++){
            if(arr[i] >= arr[i-1]){
                th1 = false;
            }
            if(arr[i] <= arr[i-1]){
                th2 = false;
            }
        }
        if(th1 || th2) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
