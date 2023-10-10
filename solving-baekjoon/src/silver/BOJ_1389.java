package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1389 {

    public static int[][] info;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 사람 수
        int n = Integer.parseInt(st.nextToken());

        // 간선 수
        int m = Integer.parseInt(st.nextToken());

        // 초기화
        info = new int[n + 1][n + 1];

        // 본인 노드 제외하고 무한대로 초기화
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    info[i][j] = 0;
                } else {
                    info[i][j] = 100_000_000;
                }
            }
        }

        // 간선 정보
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int[] x = { a, b };
            info[a][b] = 1;
            info[b][a] = 1;
        }

        // 간선 n개를 거쳐가는 경우의 수
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    info[i][j] = Math.min(info[i][j], info[i][k] + info[k][j]);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                cnt += info[i][j];
            }
            result.add(cnt);
        }

        System.out.println(result.indexOf(Collections.min(result)) + 1);

    }

}
