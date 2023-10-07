package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_14889 {

    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited;
    public static boolean[] visited2;
    public static int[] arr;
    public static int[] arr2;
    public static int[] peopleList;
    public static int[][] power;
    public static List<List<Integer>> result;
    public static List<Integer> team1;
    public static List<Integer> team2;

    public static int team1Cnt;
    public static int team2Cnt;
    public static List<Integer> resultCnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 사람 수
        int m = n / 2; // 한 팀당 사람 수

        power = new int[n][n]; // 능력치 2차원배열

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                power[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        peopleList = new int[n];
        for (int i = 0; i < n; i++) {
            peopleList[i] = i + 1;
        }

        visited = new boolean[n];
        visited2 = new boolean[n / 2];
        arr = new int[m];
        arr2 = new int[2];
        result = new ArrayList<>();
        resultCnt = new ArrayList<>();

        dfs(n, m, 0, 0);
        System.out.println(calc());
    }

    private static void dfs(int n, int m, int depth, int start) {
        if (depth == m) {
            List<Integer> arrList = Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toList());
            result.add(arrList);

            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            arr[depth] = peopleList[i];
            dfs(n, m, depth + 1, i + 1);
            visited[i] = false;
        }

    }

    private static int calc() {
        for (int i = 0; i < result.size() / 2; i++) {
            team1 = result.get(i);
            team2 = result.get(result.size() - i - 1);

            dfs2(team1.size(), 2, 0, 0, team1);
            dfs3(team2.size(), 2, 0, 0, team2);

            int resultNum = Math.abs(team1Cnt - team2Cnt);
            resultCnt.add(resultNum);

            team1Cnt = 0;
            team2Cnt = 0;
        }

        return Collections.min(resultCnt);
    }

    private static void dfs2(int n, int m, int depth, int start, List<Integer> team) {
        if (depth == m) {
            int teamCnt = power[(int) arr2[0] - 1][(int) arr2[1] - 1]
                    + power[(int) arr2[1] - 1][(int) arr2[0] - 1];
            team1Cnt += teamCnt;
            return;
        }

        for (int i = start; i < n; i++) {
            visited2[i] = true;
            arr2[depth] = team.get(i);
            dfs2(n, m, depth + 1, i + 1, team);
            visited2[i] = false;
        }

    }

    private static void dfs3(int n, int m, int depth, int start, List<Integer> team) {
        if (depth == m) {
            int teamCnt = power[(int) arr2[0] - 1][(int) arr2[1] - 1]
                    + power[(int) arr2[1] - 1][(int) arr2[0] - 1];
            team2Cnt += teamCnt;
            return;
        }

        for (int i = start; i < n; i++) {
            visited2[i] = true;
            arr2[depth] = team.get(i);
            dfs3(n, m, depth + 1, i + 1, team);
            visited2[i] = false;
        }

    }

}
