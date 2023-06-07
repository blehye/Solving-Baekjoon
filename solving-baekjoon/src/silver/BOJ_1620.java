package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		Map map1 = new HashMap();
		Map map2 = new HashMap();
		int idx = 0;
		for(int i=0; i<x; i++) {
			String name = br.readLine();
			idx++;
			map1.put(idx, name);
			map2.put(name, idx);
		}
		
		for(int i=0; i<y; i++) {
			String s = br.readLine();
			try {
				int num = Integer.parseInt(s);
				System.out.println(map1.get(num));
			}catch(NumberFormatException e) {
				System.out.println(map2.get(s));
			}
		}

	}

}
