package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9663 {
    public static int n;
    public static int[] arr;
    public static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        dfs(0);
        System.out.println(cnt);

    }

    private static void dfs(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i;
            if (test(depth)) {
                dfs(depth + 1);
            }
        }
    }

    private static boolean test(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[depth] == arr[i]) {
                return false;
            } else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) {
                return false;
            }
        }
        return true;
    }

}
