package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BOJ_2667 {

    public static int n;
    public static int[][] info;
    public static boolean[][] visited;
    public static int cnt;
    public static List<Integer> result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 지도의 크기
        n = Integer.parseInt(br.readLine());

        // 초기화
        info = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];
        result = new ArrayList<>();

        // 지도 정보
        for (int i = 1; i <= n; i++) {
            int x[] = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 1; j <= n; j++) {
                info[i][j] = x[j - 1];
            }
        }

        int idx = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (!visited[i][j] && info[i][j] == 1) {
                    Point p = new Point(i, j);
                    dfs(p, idx);
                    result.add(cnt);
                    idx++;
                    cnt = 0;
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int num : result) {
            System.out.println(num);
        }

    }

    private static void dfs(Point point, int idx) {
        visited[point.getX()][point.getY()] = true;
        cnt++;

        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { 1, -1, 0, 0 };

        for (int i = 0; i < 4; i++) {
            int xx = point.getX() + dx[i];
            int yy = point.getY() + dy[i];

            if (xx >= 1 && xx <= n && yy >= 1 && yy <= n) {
                if (!visited[xx][yy] && info[xx][yy] == 1) {
                    dfs(new Point(xx, yy), idx);
                }
            }
        }
    }

}

class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
