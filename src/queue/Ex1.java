package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1 {
//    Nhập vào một số nguyên dương n, tiếp theo nhập n số nguyên lần lượt là các phần tử của queue.
//    Cuối cùng nhập vào một số tự nhiên k.
//    Một phép biến đổi sẽ dịch chuyển phần tử đầu tiên ra sau phần tử cuối cùng của dãy,
//    hãy trả về dãy sau khi đã biến đổi k lần. In tất cả các phần tử ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
//    Với queue = [1, 2, 3, 4] và k = 1, thì kết quả mong muốn là: "2 3 4 1 ".
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int m = queue.remove();
            queue.add(m);
        }
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }
}
