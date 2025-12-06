package queue;

import java.util.*;

public class Ex2 {
    // hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int r = (int)Math.sqrt(n);
        for (int i = 3; i <= r; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // sinh các số siêu nguyên tố <= n bằng QUEUE (BFS)
    public static List<Integer> generateSuperPrimes(int n) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // các số siêu nguyên tố 1 chữ số
        int[] start = {2, 3, 5, 7};
        for (int p : start) {
            if (p <= n) {
                q.add(p);
                result.add(p);
            }
        }

        // BFS
        while (!q.isEmpty()) {
            int cur = q.poll();

            // nối thêm các chữ số 1→9 vào đuôi
            for (int d = 1; d <= 9; d++) {
                int next = cur * 10 + d;

                if (next > n) continue;
                if (isPrime(next)) {
                    result.add(next);
                    q.add(next);   // tiếp tục sinh từ số này
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (Integer i : generateSuperPrimes(n)) {
            System.out.print(i + " ");
        }

    }
}
