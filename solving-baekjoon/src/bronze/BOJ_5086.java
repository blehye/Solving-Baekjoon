package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = 1;
		int b = 1;
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if (a == 0 && b == 0) break;
			
			System.out.println(test(a, b)); 
			
		}

	}
	
	public static String test(int a, int b) {
		
		if (a < b && (b % a) == 0) {
			return "factor";

		}
		
		if (a > b && (a % b) == 0) {
			return "multiple";

		}
		
		return "neither";
		
	}

}
