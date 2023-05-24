package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2903 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(Math.round((Math.pow(2, n) + 1)*(Math.pow(2, n) + 1)));
	}

}
