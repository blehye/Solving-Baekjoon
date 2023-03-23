package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1436 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int number = 0;
		
		String n = "";
		
		while(cnt < num) {
			n = Integer.toString(number);
			if(n.contains("666")) {
				cnt++;
			}
			number++;
		}
		
		System.out.println(n);

	}

}
