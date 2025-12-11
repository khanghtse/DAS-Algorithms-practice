package queue;

import java.util.*;

public class Ex3 {
//    Với a = [1, 2, 1, 3, 4], k = 3. thì messagesPhone(a) = [2, 3, 4];
//
//    Giải thích:
//    Lúc đầu màn hình điện thoại rỗng [].
//    Sau khi 1 nhắn tin đến thì màn hình hiển thì [1].
//    Sau khi 2 nhắn tin đến thì màn hình hiển thị [1, 2].
//    Sau khi 1 nhắn tin đến thì màn hình không thay đổi gì vì trên màn hình đã có tin nhắn của 1 rồi.
//    Sau khi 3 nhắn tin đến màn hình hiển thị [1, 2, 3]
//    Sau khi 4 nhắn tin đến, lúc này màn hình đã hiển thị đủ 3 tin nhắn rồi nên điện thoại sẽ đẩy tin nhắn đầu tiên là 1
//    đi và chèn tin nhắn của 4 vào cuối, cuối cùng màn hình hiển thị [2, 3, 4].
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if(!set.contains(m)){
                queue.add(m);
                set.add(m);
            }

        }

        int k = sc.nextInt();
        for (int i = 0; i < queue.size() - k + 1; i++) {
            queue.poll();
        }
        for (int i: queue) {
            System.out.print(i+ " ");
        }
    }
}
