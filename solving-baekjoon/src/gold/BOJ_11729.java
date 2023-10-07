package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int) Math.pow(2, n) - 1);
        hanoi(n, 1, 3, 2);
        System.out.println(sb);

    }

    private static void hanoi(int n, int start, int end, int sub) {
        if (n == 1) {
            sb.append(start + " " + end);
            sb.append("\n");
            return;
        } else {
            hanoi(n - 1, start, sub, end);
            sb.append(start + " " + end);
            sb.append("\n");
            hanoi(n - 1, sub, end, start);
        }
    }

}
