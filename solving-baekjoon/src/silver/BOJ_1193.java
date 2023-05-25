package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int x = 1;
		while(n>x) {
			n -= x;
			x++;
		}
		
		if(x % 2 == 0) {
			System.out.println(n + "/" + (x - n + 1));
		}else {
			System.out.println(x - n + 1 + "/" + n);
		}

	}

}
