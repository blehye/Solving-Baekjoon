package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_10773 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		
		int idx = 0;
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				list.remove(idx-1);
				idx--;
			}else {
				list.add(x);
				idx++;
			}
		}
		
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);

	}

}
