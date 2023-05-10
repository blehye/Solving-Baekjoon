package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선 개수
		int n = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수	
		int[] line = new int[k];
		
		for(int i = 0; i < k; i++) {
			line[i] = Integer.parseInt(br.readLine());
		}
		
		long min = 0;
		long mid = 0;
		long max = getMax(line);
        
        max++;

		while(min < max) {
			
			mid = (min + max)/2;
			long cnt = 0;
			
			for(int i : line) {
				cnt += i/mid;
			}
			
			if(cnt < n) {
				max = mid;
			}else {
				min = mid + 1;
			}
				
		}
		
		System.out.println(min - 1);

	}
	
	private static int getMax(int[] line) {
		int max = 0;
		for(int num : line) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}

}
