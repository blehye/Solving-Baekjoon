package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_10815 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Map<String, String> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			map.put(st.nextToken(), "1");
		}
		
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		StringBuffer bf = new StringBuffer();
		
		for(int i=0; i<M; i++) {
			if(map.containsKey(st2.nextToken())) {
				bf.append(1 + " ");
			}else {
				bf.append(0 + " ");
			}
		}
		System.out.println(bf);

	}

}
