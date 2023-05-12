package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			int y = n % h;
			int x = (n / h) + 1;
			
			if(y == 0) {
				y = h;
				x = n / h;
			}
		
			System.out.println(100*y + x);
		}
	}

}
