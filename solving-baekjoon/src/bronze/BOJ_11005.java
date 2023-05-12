package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_11005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		Stack<String> stack = new Stack<>();
		int y = 1;
		
		while(y != 0) {
			y = n / b;
			int x = n % b;
			
			if(x >= 10 && x <= 35) {
				stack.push((char)(x + 55)+"");
			}else {
				stack.push(Integer.toString(x));
			}
			n = y;
		}
		
		while(!stack.empty()) {
			System.out.print(stack.peek());
			stack.pop();
		}
		
	}

}
