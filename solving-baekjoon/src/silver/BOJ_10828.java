package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_10828 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String[] arr = str.split(" ");
				stack.push(Integer.parseInt(arr[1]));
			}
			
			if(str.contains("top")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());					
				}
			}
			
			if(str.contains("empty")) {
				if(stack.empty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			
			if(str.contains("size")) {
				System.out.println(stack.size());
			}
			
			if(str.contains("pop")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.pop());
				}
			}
		}

	}

}
