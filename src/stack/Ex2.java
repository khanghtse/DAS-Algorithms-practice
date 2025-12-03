package stack;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
//    Nhập vào một số nguyên dương n.
//    Hãy chuyển n thành mã nhị phân và in chuỗi đó ra màn hình.
//    Với n = 13 thì stackBin(n) ="1101".
//    Giải thích: (1101)2 = 13.
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        do {
            int reminder = n % 2;
            n = n / 2;
            stack.push(reminder);
        } while (n > 0);

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
