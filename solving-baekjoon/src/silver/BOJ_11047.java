package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 동전 종류 개수
        int n = Integer.parseInt(st.nextToken());

        // 만들어야하는 금액
        int k = Integer.parseInt(st.nextToken());

        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }

        // 금액 배열에서 뒤에서부터 탐색
        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            int p = price[i];
            int x = k / p;
            if (x != 0) {
                cnt += x;
                k = k % p;
            }
        }

        System.out.println(cnt);

    }

}
