package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2420 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		long a = Long.parseLong(str[0]);
		long b = Long.parseLong(str[1]);
		
		if(a-b <0) {
			System.out.println((a-b)*(-1));
		}else {
			System.out.println(a-b);
		}
		

	}

}
