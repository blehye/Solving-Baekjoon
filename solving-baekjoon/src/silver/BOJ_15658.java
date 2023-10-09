package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class BOJ_15658 {

    public static int n;
    public static boolean[] visited;
    public static String[] arr;
    public static int[] numList;
    public static List<String> math;
    public static List<Integer> resultList;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken()); // 수의 개수

        String numStr = br.readLine();
        numList = Stream.of(numStr.split(" ")).mapToInt(Integer::parseInt).toArray(); // 수 배열

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int plusCnt = Integer.parseInt(st2.nextToken());
        int minusCnt = Integer.parseInt(st2.nextToken());
        int mulCnt = Integer.parseInt(st2.nextToken());
        int divCnt = Integer.parseInt(st2.nextToken());

        math = new ArrayList<>();

        for (int i = 0; i < plusCnt; i++) {
            math.add("+");
        }

        for (int i = 0; i < minusCnt; i++) {
            math.add("-");
        }

        for (int i = 0; i < mulCnt; i++) {
            math.add("*");
        }

        for (int i = 0; i < divCnt; i++) {
            math.add("%");
        }

        visited = new boolean[math.size()];
        arr = new String[n - 1];
        resultList = new ArrayList<>();

        dfs(n - 1, n - 1, 0);
        System.out.println(Collections.max(resultList));
        System.out.println(Collections.min(resultList));
    }

    private static void dfs(int n, int m, int depth) {
        if (depth == m) {
            calc();
            return;
        }

        String before = "";
        for (int i = 0; i < math.size(); i++) {
            if (!visited[i] && !before.equals(math.get(i))) {
                visited[i] = true;
                arr[depth] = math.get(i);
                before = math.get(i);
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }

    }

    private static void calc() {
        int result = numList[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].equals("+")) {
                result += numList[i + 1];
            }

            if (arr[i].equals("-")) {
                result -= numList[i + 1];
            }

            if (arr[i].equals("*")) {
                result *= numList[i + 1];
            }

            if (arr[i].equals("%")) {
                result /= (int) numList[i + 1];
            }
        }
        resultList.add(result);
    }

}
