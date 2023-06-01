package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int d = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new HashMap<>();
		
		for(int i=0; i<d; i++) {
			String name = br.readLine();
			map.put(name, "");
		}
		
		List<String> result = new ArrayList<>();
		
		for(int i=0; i<b; i++) {
			String name = br.readLine();
			if(map.get(name) != null) {
				result.add(name);
			}
		}
		
		Collections.sort(result);
		
		System.out.println(result.size());
		
		for(String item : result) {
			System.out.println(item);
		}

	}

}
