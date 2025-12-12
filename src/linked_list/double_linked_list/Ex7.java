package linked_list.double_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex7 {
//    Nhập vào một số nguyên dương n, hãy cài đặt một danh sách lên kết đôi để lưu các số từ n giảm về 1 và từ 1 răng đến n (xem ví dụ để rõ hơn).
//    In ra danh sách liên kết đó, phía sau mỗi phần tử có một khoảng trắng.

//            Với n = 3 thì kết quả mong muốn là:
//            "3 2 1 2 3".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            linkedList.push(i);
        }

        for (int i = 2; i <= n; i++) {
            linkedList.offer(i);
        }

        linkedList.forEach(e -> System.out.print(e + " "));
        sc.close();
    }
}
