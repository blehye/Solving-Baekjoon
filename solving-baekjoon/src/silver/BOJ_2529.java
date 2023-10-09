package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2529 {
    public static int n;
    public static int m;
    public static boolean[] visited;
    public static int[] arr;
    public static String[] calc;
    public static List<String> result;

    public static void main(String[] args) throws Exception {
        // 부등호 개수 n
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // n개의 부등호 관계
        String[] sign = br.readLine().split(" ");
        calc = new String[2 * n + 1];

        int idx = 1;
        for (String s : sign) {
            calc[idx] = s;
            idx += 2;
        }

        // 뽑아낼수있는 숫자는 m = n+1 개
        m = n + 1;

        int num = 10;
        // 초기화
        visited = new boolean[num];
        arr = new int[m];
        result = new ArrayList<>();

        // 0 ~ 9 까지 수에서 n+1 개 선택하는 경우의 수
        dfs(num, m, 0);

        System.out.println(Collections.max(result));
        System.out.println(Collections.min(result));
    }

    public static void dfs(int n, int m, int depth) {
        if (depth == m) {
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                calc[idx] = Integer.toString(arr[i]);
                idx += 2;
            }
            calcNum();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static void calcNum() {
        boolean flag = true;

        int idx = 0;
        for (int i = 0; i < n; i++) {
            int n = Integer.parseInt(calc[idx]);
            String s = calc[idx + 1];
            int m = Integer.parseInt(calc[idx + 2]);

            if (s.equals("<") && n < m) {
                flag = true;
            } else if (s.equals(">") && n > m) {
                flag = true;
            } else {
                flag = false;
                return;
            }

            idx += 2;
        }

        if (flag) {
            result.add(makeResult());
        }
    }

    public static String makeResult() {
        String str = "";
        for (int i = 0; i < calc.length; i += 2) {
            str += calc[i];
        }

        return str;
    }

}
