package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11724 {

    public static int[][] info;
    public static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 정점의 개수
        int n = Integer.parseInt(st.nextToken());

        // 간선의 개수
        int m = Integer.parseInt(st.nextToken());

        // 초기화
        info = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        // 연결 정보
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            info[a][b] = 1;
            info[b][a] = 1;
        }

        // dfs
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    private static void dfs(int v) {
        visited[v] = true;

        for (int i = 1; i < info.length; i++) {
            if (!visited[i] && info[v][i] == 1) {
                visited[i] = true;
                dfs(i);
            }
        }
    }

}
