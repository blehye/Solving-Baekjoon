package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Info> arr = new ArrayList<>();
		int[] result = new int[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			Info info = new Info();
			info.setWeight(Integer.parseInt(st.nextToken()));
			info.setHeight(Integer.parseInt(st.nextToken()));
			
			arr.add(info);
			
		}
		
		for(int i=0; i<n; i++) {
			int cnt = 0;
			Info info = arr.get(i);
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				if(info.getWeight() < arr.get(j).getWeight() && info.getHeight() < arr.get(j).getHeight()) {
					cnt++;
				}
			}
			result[i] = cnt + 1;
			System.out.println(result[i]);
		}

	}
	
}

class Info {
	private int weight;
	private int height;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
}
