package linked_list.single_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex5 {
//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn.
//    Tiếp theo nhập hai số nguyên a và b.
//    Hãy thay đổi giá trị của những phần tử có giá trị a thành giá trị b.
//    In ra màn hình danh sách đó, sau một phần tử có đúng một khoảng trắng.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) linkedList.add(sc.nextInt());
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i: linkedList) {
            if (i == a) {
                linkedList.set(linkedList.indexOf(i), b );
            }
        }
        for (int i: linkedList) {
            System.out.print(i + " ");
        }
    }
}
