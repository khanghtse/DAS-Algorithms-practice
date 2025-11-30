package arrays;

import java.util.Scanner;

public class Ex6 {
//    Nhập và một số nguyên dương n, tiếp theo là n số nguyên dương lần lượt là các phần tử của một dãy số,
//    hãy đếm tần số (số lần xuất hiện) của các số trong dãy và in nó ra màn hình dưới dạng sau: "a1 - t1; a2 - t2; ... an - tn; ",
//    trong đó t1 là số lần xuất hiện của số a1, t2 là số lần xuất hiện của a2, ... a1, a2, .. an không trùng nhau và được sắp xếp tăng dần
//    Với a = [4, 2, 2, 5, 6, 5] thì kết quả mong muốn là: "2 - 2; 4 - 1; 5 - 2; 6 - 1; ".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int MAX_VALUE = 100000;
        int[] tickArray = new int[MAX_VALUE];

        for(int i = 0; i < n; i++){
            int val =  sc.nextInt();
            tickArray[val]++;
        }

        for(int i = 0; i < tickArray.length; i++){
            if(tickArray[i] > 0){
                System.out.print(i + " - " + tickArray[i] + "; ");
            }
        }
    }
}
