package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_25314 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int x = n/4;
		
		for(int i=0; i<x; i++) {
			System.out.print("long ");
		}
		System.out.print("int");

	}

}
