package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BOJ_10819 {
    public static int[] numList;
    public static boolean[] visited;
    public static int[] arr;
    public static List<Integer> calcResult;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n;
        visited = new boolean[n];
        arr = new int[n];
        calcResult = new ArrayList<>();

        numList = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numList);

        dfs(n, m, 0);
        int result = Collections.max(calcResult);
        System.out.println(result);

    }

    private static void dfs(int n, int m, int depth) {
        if (depth == m) {
            calc();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = numList[i];
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }

    private static void calc() {
        int sum = 0;
        int i = 0;
        while (i < arr.length - 1) {
            sum += Math.abs(arr[i] - arr[i + 1]);
            i += 1;
        }
        calcResult.add(sum);
    }

}
