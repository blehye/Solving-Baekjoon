package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BOJ_2961 {

    public static int n;
    public static long[][] info;
    public static long[][] arr;
    public static boolean[] visited;
    public static List<Long> result;

    public static void main(String[] args) throws Exception {
        // 재료 개수 n
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 재료 정보 이차원 배열
        info = new long[n][2];
        for (int i = 0; i < n; i++) {
            long[] item = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            info[i] = item;
        }

        // 초기화
        arr = new long[n][2];
        visited = new boolean[n];
        result = new ArrayList<>();

        // 1개 ~ n개 중복되지 않게 뽑는 경우의 수
        for (int i = 1; i <= n; i++) {
            dfs(n, i, 0, 0);
        }

        System.out.println(Collections.min(result));
    }

    public static void dfs(int n, int m, int depth, int start) {
        if (depth == m) {
            int a = 1;
            int b = 0;
            for (int i = 0; i < m; i++) {
                a *= arr[i][0];
                b += arr[i][1];
            }
            result.add((long) Math.abs(a - b));
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = info[i];
                dfs(n, m, depth + 1, start + 1);
                visited[i] = false;
            }
        }

    }

}
