package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_7785 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		
		for(int i=0; i<x; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			if(map.containsKey(name)) {
				map.remove(name);
			}else {
				map.put(name, name);
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(String li : list) {
			System.out.println(li);
		}

	}

}
