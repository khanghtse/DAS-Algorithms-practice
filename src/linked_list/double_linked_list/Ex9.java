package linked_list.double_linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }

        int k = sc.nextInt();
        linkedList.remove(linkedList.get(k));
        for (int i : linkedList) {
            System.out.print(i + " ");
        }
    }
}
