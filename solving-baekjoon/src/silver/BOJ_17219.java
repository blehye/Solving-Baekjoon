package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_17219 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		Map map = new HashMap();

		for(int i=0; i<x; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			map.put(st2.nextToken(), st2.nextToken());
		}
		
		for(int i=0; i<y; i++) {
			String s = br.readLine();

			System.out.println(map.get(s));

		}

	}

}
