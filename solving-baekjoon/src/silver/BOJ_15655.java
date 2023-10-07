package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BOJ_15655 {

    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited;
    public static int[] arr;
    public static int[] numList;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        numList = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numList);

        visited = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0, 0);
        System.out.println(sb);
    }

    private static void dfs(int n, int m, int depth, int start) {
        if (depth == m) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = numList[i];
                dfs(n, m, depth + 1, i + 1);
                visited[i] = false;
            }
        }

    }

}
