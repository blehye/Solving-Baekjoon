package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10813 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}
		
		for(int i=1; i<=m; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st2.nextToken());
			int y = Integer.parseInt(st2.nextToken());
			int x2 = arr[x-1];
			int y2 = arr[y-1];

			arr[x-1] = y2;
			arr[y-1] = x2;
			
		}
		
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+ " ");
		}
			

	}

}
