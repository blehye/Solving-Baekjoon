package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2587 {
	
	public static void main(String[] args) throws Exception {
		int N = 5;
		int[] arr = new int[N];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
			sum += num;
		}
		
		Arrays.sort(arr);
		
		int mid = arr.length / 2 + 1;
		
		// 총합
		System.out.println(sum / arr.length);
		
		// 중앙값
		System.out.println(arr[mid - 1]);
		
	}
	
}
