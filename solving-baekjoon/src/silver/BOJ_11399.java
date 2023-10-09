package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class BOJ_11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수
        int n = Integer.parseInt(br.readLine());

        // 각 사람마다 걸리는 시간 배열
        int[] time = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(time);

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                sum += time[j];
            }
        }

        System.out.println(sum);
    }
}
