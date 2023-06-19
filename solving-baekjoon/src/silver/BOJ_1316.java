package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			if (test(str)) cnt++;
		}
		
		System.out.println(cnt);

	}
	
	public static boolean test(String str) {
		
		boolean[] check = new boolean[26];
		
		int prev = 0;
		
		for (int i=0; i<str.length(); i++) {
			int x = str.charAt(i);
			
			if (prev != x) {
				if (check[x - 'a'] == false) {
					check[x - 'a'] = true;
					prev = x;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}
		
		return true;
	}

}
