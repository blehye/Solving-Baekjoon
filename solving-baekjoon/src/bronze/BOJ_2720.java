package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2720 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int q = 25;
		int d = 10;
		int n = 5;
		int p = 1;

		for(int i=0; i<num; i++) {
			int money = Integer.parseInt(br.readLine());
			
			int qCnt = money / q;
			int dCnt = (money % q) / d;
			int nCnt = ((money % q) % d) / n;
			int pCnt = (((money % q) % d) % n) / p;
			
			System.out.println(qCnt + " " + dCnt + " " + nCnt + " " + pCnt);
			
		}
	}

}
