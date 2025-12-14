package linear_search;

import java.util.Scanner;

public class Ex1 {
//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên lần lượt là các phần tử trong dãy a, cuối cùng nhập số nguyên x.
//    Hãy đưa ra chỉ số đầu tiên của phần tử đầu tiên có giá trị bằng x, nếu không tồn tại số đó thì trả về -1.
//    Với a = [1, 3, 2, 1] và x = 1 thì kết quả mong muốn là 0.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
