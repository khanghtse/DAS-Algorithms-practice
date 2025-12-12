package linked_list.single_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {
    // lam quen voi linked list
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.offer(sc.nextInt());
        }
        for (int i : linkedList) {
            System.out.print(i + " ");
        }

    }
}
