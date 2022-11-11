package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11382 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] numStr = br.readLine().split(" "); 
		
		long a = Long.parseLong(numStr[0]);
		long b = Long.parseLong(numStr[1]);
		long c = Long.parseLong(numStr[2]);
		
		System.out.println(a+b+c);

	}

}
