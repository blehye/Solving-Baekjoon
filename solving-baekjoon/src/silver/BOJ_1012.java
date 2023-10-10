package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
    public static int w;
    public static int h;
    public static int[][] info;
    public static boolean[][] visited;
    public static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken()); // 가로길이
            h = Integer.parseInt(st.nextToken()); // 세로길이
            int k = Integer.parseInt(st.nextToken()); // 배추개수

            // 초기화
            info = new int[h + 1][w + 1];
            visited = new boolean[h + 1][w + 1];
            cnt = 0;

            // 배추 정보
            for (int j = 0; j < k; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());
                info[b + 1][a + 1] = 1;
            }

            // dfs
            for (int a = 1; a <= h; a++) {
                for (int b = 1; b <= w; b++) {
                    if (!visited[a][b] && info[a][b] == 1) {
                        dfs(new Point(a, b));
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

        }
    }

    private static void dfs(Point point) {
        visited[point.getX()][point.getY()] = true;

        int[] dx = { 0, 0, -1, 1 };
        int[] dy = { 1, -1, 0, 0 };

        for (int i = 0; i < 4; i++) {
            int xx = point.getX() + dy[i];
            int yy = point.getY() + dx[i];

            if (xx >= 1 && xx <= h && yy >= 1 && yy <= w) {
                if (!visited[xx][yy] && info[xx][yy] == 1) {
                    dfs(new Point(xx, yy));
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
