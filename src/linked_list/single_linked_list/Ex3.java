package linked_list.single_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex3 {
//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn.
//    Tiếp theo cho một số nguyên k, (0 ≤ k < n), hãy xóa phần tử ở chỉ số k và in ra màn hình danh sách đó, sau một phần tử
//    có một khoảng trắng.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) linkedList.add(sc.nextInt());

        int k = sc.nextInt();

        linkedList.remove(k);
        for (int i: linkedList) System.out.print(i + " ");
        sc.close();
    }
}
