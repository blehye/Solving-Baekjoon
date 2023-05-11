package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String n = st.nextToken();
		String b = st.nextToken();
		
		char[] nArr = new char[n.length()];
		
		for(int i=0; i<n.length(); i++) {
			nArr[i] = n.charAt(i);
		}
		
		int sum = 0;
		int pow = 0;
		for(int i=n.length()-1; i>=0; i--) {
			int x = 0;
			if(checkAlpha((int)nArr[i])) {
				x = (int)nArr[i] - 55;
			}else {
				x = nArr[i] - '0';
			}			
			sum += x * Math.pow(Integer.parseInt(b), pow);
			pow++;
		}
		
		System.out.println(sum);
		
	}
	
	private static boolean checkAlpha(int code) {
		if(code >= 65 && code <= 90) {
			return true;
		}
		return false;
	}

}
