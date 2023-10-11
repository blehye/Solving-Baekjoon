package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BOJ_11403 {

    public static int[][] info;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 노드 수
        int n = Integer.parseInt(br.readLine());

        // 초기화
        info = new int[n][n];

        // 본인 노드 제외하고 무한대로 초기화
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    info[i][j] = 0;
                } else {
                    info[i][j] = 100_000_000;
                }
            }
        }

        // 간선 정보
        for (int i = 0; i < n; i++) {
            int[] x = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            info[i] = x;
        }

        // 간선 n개를 거쳐가는 경우의 수
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (info[i][k] == 1 && info[k][j] == 1) {
                        info[i][j] = 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(info[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }

}
