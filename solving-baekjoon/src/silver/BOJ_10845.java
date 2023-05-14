package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BOJ_10845 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		int back = 0;
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			if(str.contains("push")) {
				String[] arr = str.split(" ");
				queue.add(Integer.parseInt(arr[1]));
				back = Integer.parseInt(arr[1]);
			}
			
			if(str.contains("front")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.peek());					
				}
			}
			
			if(str.contains("pop")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(queue.remove());					
				}
			}
			
			if(str.contains("empty")) {
				if(queue.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			
			if(str.contains("size")) {
				System.out.println(queue.size());
			}
			
			if(str.contains("back")) {
				if(queue.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(back);
				}
			}
		}

	}

}
