package arrays;

import java.util.Scanner;

public class Ex9 {
//    Nhập và hai số nguyên dương m và n lần lượt là số hàng và số cột của mảng hai chiều a,
//    tiếp theo là nhập các phần tử của mảng đó.
//    Hãy tính và đưa ra tổng của tất cả các phần tử trong mảng a.
//    Với a = [[1, 2, 3], [4, 5, 6]] thì kết quả mong muốn là 21.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j=0; j < n; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        // matrix.length: số lượng hàng của mảng 2 chiều
        for(int i = 0; i < matrix.length ;i++){
            // matrix[i].length: số lượng cột ở hàng i
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
