package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		int x = b + c;
		
		if (x < 60) {
			b = x;
		}
		
		if (x >= 60) {
			a += x / 60;
			b =  x % 60;
		}
		
		if (a >= 24) {
			a -= 24;
		}
		
		System.out.println(a + " " + b);

	}

}
