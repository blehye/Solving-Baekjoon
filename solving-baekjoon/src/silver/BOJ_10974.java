package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10974 {

    public static boolean[] visited;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n];
        arr = new int[n];
        dfs(n, 0);
        System.out.println(sb);

    }

    public static void dfs(int n, int depth) {
        if (depth == n) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(n, depth + 1);
                visited[i] = false;
            }
        }
    }

}
