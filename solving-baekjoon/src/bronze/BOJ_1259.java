package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String num = br.readLine();
			if(num.equals("0")) {
				break;
			}
			int len = num.length();
			int end = (len/2) - 1;
			int cnt = 0;
			for(int i=0; i<=end; i++) {
				if(num.charAt(i) != num.charAt(len-1-i)) {
					cnt++;
				}
			}
			if(cnt != 0) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
		}

	}

}
