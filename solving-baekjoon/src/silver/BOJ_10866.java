package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_10866 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			if(str.contains("push_front")) {
				String[] arr = str.split(" ");
				deque.addFirst(Integer.parseInt(arr[1]));
			}
			
			if(str.contains("push_back")) {
				String[] arr = str.split(" ");
				deque.addLast(Integer.parseInt(arr[1]));
			}
			
			if(str.contains("pop_front")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.pollFirst());					
				}
			}
			
			if(str.contains("pop_back")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.pollLast());					
				}
			}
			
			if(str.equals("front")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.getFirst());					
				}
			}
			
			if(str.equals("back")) {
				if(deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.getLast());
				}
			}
			
			if(str.contains("empty")) {
				if(deque.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			
			if(str.contains("size")) {
				System.out.println(deque.size());
			}
			
		}

	}

}
