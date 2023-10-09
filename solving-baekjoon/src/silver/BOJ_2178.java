package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class BOJ_2178 {
    public static int n;
    public static int m;
    public static int[][] info;
    public static int[][] newInfo;
    public static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = x[0];
        m = x[1];

        info = new int[n + 1][m + 1];
        newInfo = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {

            int[] arr = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            int[] arr2 = new int[m + 1];
            for (int j = 0; j < arr.length; j++) {
                arr2[j + 1] = arr[j];
            }

            info[i] = arr2;
        }

        newInfo = info;

        visited[1][1] = true;
        bfs(new Point(1, 1));
        System.out.println(newInfo[n][m]);
    }

    private static void bfs(Point point) {
        Queue<Point> que = new LinkedList<>();
        que.add(point);

        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { 1, -1, 0, 0 };

        while (!que.isEmpty()) {
            Point p = que.poll();
            int cnt = newInfo[p.getY()][p.getX()] + 1;

            for (int i = 0; i < 4; i++) {
                int xx = p.getX() + dx[i];
                int yy = p.getY() + dy[i];

                if (xx >= 1 && xx <= m && yy >= 1 && yy <= n) {
                    if (!visited[yy][xx] && info[yy][xx] == 1) {
                        visited[yy][xx] = true;
                        newInfo[yy][xx] = cnt;
                        que.add(new Point(xx, yy));
                    }
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
