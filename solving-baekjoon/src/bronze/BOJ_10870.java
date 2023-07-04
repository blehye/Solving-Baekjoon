package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(test(n));
		
	}
	
	public static int test(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return test(n-1) + test(n-2);
	}
}
