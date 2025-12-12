package single_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex4 {
//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn,
//    tiếp theo nhập số nguyên k (0 ≤ k < n).
//    Hãy đưa ra giá trị phần tử ở chỉ số k
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) linkedList.add(sc.nextInt());
        int k = sc.nextInt();
        int x = linkedList.get(k);
        System.out.println(x);
        sc.close();
    }
}
