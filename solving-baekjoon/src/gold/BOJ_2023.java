package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2023 {
    public static int n;
    public static int[] arr;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        // 몇자리수인지 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 0~9 까지 수로 숫자를 만들수있음
        int num = 10;

        // 초기화
        arr = new int[n];
        visited = new boolean[num];

        // 숫자 조합 만들기
        dfs(num, n, 0);
        System.out.println(sb);

    }

    public static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num);
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            visited[i] = true;
            arr[depth] = i;

            StringBuilder sb2 = new StringBuilder();
            for (int d = 0; d <= depth; d++) {
                sb2.append(arr[d]);
            }

            boolean isPrime = true;
            String numStr = sb2.toString();

            for (int j = 0; j < numStr.length(); j++) {
                String slice = numStr.substring(0, j + 1);
                if (!chkPrime(Long.parseLong(slice))) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                dfs(n, m, depth + 1);
            }

            visited[i] = false;
        }

    }

    public static boolean chkPrime(long n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
