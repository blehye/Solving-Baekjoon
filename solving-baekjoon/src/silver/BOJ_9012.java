package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<String> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			String[] arr = str.split("");
			
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("(")) {
					stack.push(arr[j]);
				} else {
					int size = stack.size();
					if (size == 0) {
						stack.push(arr[j]);
						break;
					} else {
						stack.pop();
					}
				}
			}
			
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
			stack.clear();
			
		}

	}

}
