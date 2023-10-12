package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
    public static int[] info;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        info = new int[10001];

        bfs(n, m);

    }

    private static void bfs(int v, int m) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        info[v] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == m) {
                    System.out.println(info[temp]);
                    return;
                }

                if (next >= 0 && next < info.length && info[next] == 0) {
                    q.add(next);
                    info[next] = info[temp] + 1;
                }
            }

        }
    }
}
