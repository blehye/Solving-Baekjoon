package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10988 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(check(str));
		
	}
	
	public static int check(String str) {
		int len1 = str.length();
		
		if (len1 == 0) {
			return 1;
		}
		
		int len2 = len1/2 - 1;
		
		int result = 1;

		if (len1 % 2 != 0) {
			for(int i=0; i<len2; i++) {
				if(str.charAt(i) != str.charAt(len1-1-i)) {
					result = 0;
					break;
				}
				
			}
			
		}else {
			for(int i=0; i<=len2; i++) {
				if(str.charAt(i) != str.charAt(len1-1-i)) {
					result = 0;
					break;
				}
				
			}
		}
		
		return result;
	}

}
