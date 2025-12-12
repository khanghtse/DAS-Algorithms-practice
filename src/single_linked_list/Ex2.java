package single_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex2 {
//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn.
//    Tiếp theo nhập hai số nguyên k và x, (0 ≤ k ≤ n), hãy chèn giá trị x vào danh sách liên kết tại chỉ số k và in ra màn hình
//    danh sách đó, sau một phần tử có một khoảng trắng.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }

        int k = sc.nextInt();
        int x = sc.nextInt();
        linkedList.add(k, x);
        for (int i: linkedList) {
            System.out.print(i + " ");
        }
    }
}
