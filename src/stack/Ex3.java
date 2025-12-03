package stack;

import java.util.Scanner;
import java.util.Stack;

public class Ex3 {
//    Cho một sâu s chỉ gồm các ký tự viết thường, hãy viết hàm trả về chuỗi mã hóa của sâu này.
//    Xem ví dụ để hiểu rõ hơn quá trình mã hóa.
//    Với s = "aaabbaaac" thì encodeString(s) = "a3b2a3c1".
    public static void main (String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str == null || str.isEmpty()) {
            return;
        }

        StringBuffer sb = new StringBuffer();
        for (Character c : str.toCharArray()) {
            if (stack.isEmpty() || c == stack.peek()) {
                // cùng ký tự → push tiếp
                stack.push(c);
            } else {
                // khác ký tự → pop và đếm
                char prev = stack.peek();
                int count = 0;
                while (!stack.isEmpty() && prev == stack.peek()) {
                    stack.pop();
                    count++;
                }
                sb.append(prev).append(count);
                // bắt đầu nhóm mới
                stack.push(c);
            }
        }

        // xử lý nhóm cuối
        char last = stack.peek();
        int count = 0;
        while (!stack.isEmpty() && stack.peek() == last) {
            stack.pop();
            count++;
        }
        sb.append(last).append(count);

        System.out.println(sb);
    }
}
