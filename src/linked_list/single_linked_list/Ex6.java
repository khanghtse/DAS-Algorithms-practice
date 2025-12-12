package linked_list.single_linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex6 {
//    Nhập vào một số nguyên dương n, tiếp theo là n số nguyên của một dãy số, hãy cài đặt nó vào một danh sách liên kết đơn.
//    Tiếp theo nhập một số nguyên k (0 ≤ k <n).
//    Hãy xóa những phần tử có giá trị lớn hơn giá trị của phần tử ở chỉ số k.
//    In ra màn hình danh sách đó, sau một phần tử có đúng một khoảng trắng.

//            Với  l = [1, 1, 2, 2, 3, 3], k = 2, thì kết quả sẽ là:
//            "1 1 2 2 ".

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            linkedList.add(sc.nextInt());
        }

        int k = sc.nextInt();
        int val = linkedList.get(k);
        // dung iterator de xoa AN TOAN, ko anh huong den kich thuoc cua list
        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext()) {
            if(it.next() > val){
                it.remove();
            }
        }

        for(int i: linkedList){
            System.out.print(i+ " ");
        }

        sc.close();
    }
}
