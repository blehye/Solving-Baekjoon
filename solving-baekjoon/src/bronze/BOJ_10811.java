package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10811 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=1; i<=m; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st2.nextToken());
			int y = Integer.parseInt(st2.nextToken());
			
			List<Integer> list = new ArrayList<>();
			
			for(int j=x; j<=y ; j++) {
				list.add(arr[j-1]);
			}
			Collections.reverse(list);
			
			for(int j=x; j<=y ; j++) {
				arr[j-1] = list.get(j-x);
			}
		}
		
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
