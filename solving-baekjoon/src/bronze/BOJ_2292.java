package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2292 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); 
		
		int x = 6;
		int result = 1;
		int a = 1;
		int b = 1;
		
		while(true) {
			if (num == 1) break;
			a += 1;
			b += x;
			
			if (num >= a && num <= b) { 
				result += 1;
				break;
			}
			result += 1;
			x += 6;
		}
		
		System.out.println(result);
	}

}
