package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2606 {
	
	static int[][] arr;
	static boolean[] visited;
	static int cnt;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 컴퓨터 수
		int M = Integer.parseInt(br.readLine()); // 쌍 수
		
		arr = new int[N+1][N+1];
		
		for (int i=0; i<M; i++) {
			String[] str2 = br.readLine().split(" ");
			int a = Integer.parseInt(str2[0]); 
			int b = Integer.parseInt(str2[1]);
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		visited = new boolean[N+1];
		bfs(1);
		System.out.println(cnt-1);

	}
	
	static void dfs(int V) {
		visited[V] = true;
		cnt++;
//		System.out.println(V);
		
		for (int i=V; i<arr.length; i++) {
			if (arr[V][i] == 1 && visited[i] == false) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		visited[V] = true;
		cnt++;
//		System.out.print(V + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int node = 1; node<arr.length; node++) {
				if(arr[temp][node] == 1 && visited[node] == false) {
					queue.add(node);
					visited[node] = true;
					cnt++;
//					System.out.print(node + " ");
				}
			}
		}
	}

}
