package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = 0;
		}
		
		for(int i=1; i<=m; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st2.nextToken());
			int y = Integer.parseInt(st2.nextToken());
			int z = Integer.parseInt(st2.nextToken());
			
			for(int j=x; j<=y ; j++) {
				arr[j-1] = z;
			}
			
		}
		
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
