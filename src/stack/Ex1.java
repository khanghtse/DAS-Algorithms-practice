package stack;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
//    Cho một string, nhiệm vụ của bạn là in chuỗi đảo ngược của string đó ra màn hình bằng cách dùng stack.
//    Với s = "codelearn" thì reverseString(s) = "nraeledoc".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for(Character ch: str.toCharArray()){
            stack.push(ch);
        }
        StringBuffer sb = new StringBuffer();


        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        sc.close();
    }
}
