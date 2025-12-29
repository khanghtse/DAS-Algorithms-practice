package linked_list.circle_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {

//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết vòng.
//    Tiếp theo cho một số nguyên k, (0 ≤ k < n).
//    Hãy in ra màn hình các phần tử ở chỉ số k đến n-1 rồi từ chỉ số 0 đến k-1, sau một phần tử có một khoảng trắng.

//    Với l = [1, 2, 3, 4] và k = 2 thì kết quả mong muốn là:
//            "3 4 1 2".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();

        for(int i = 0; i < k; i++){
            int x = list.removeFirst();
            list.addLast(x);
        }

        for(int i: list) {
            System.out.print(i + " ");
        }
    }
}
