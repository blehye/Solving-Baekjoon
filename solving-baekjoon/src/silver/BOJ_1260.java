package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_1260 {
	
	static int[][] arr;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]); // 정점의 개수
		int M = Integer.parseInt(str[1]); // 간선의 개수
		int V = Integer.parseInt(str[2]); // 탐색을 시작할 정점의 번호
		
		arr = new int[N+1][N+1];
		
		for(int i=0; i<M; i++) {
			String[] str2 = br.readLine().split(" ");
			int a = Integer.parseInt(str2[0]);
			int b = Integer.parseInt(str2[1]);
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		visited = new boolean[N+1];
		dfs(V);
		System.out.println();
		visited = new boolean[N+1];
		bfs(V);

	}
	
	static void dfs(int V) {
		visited[V] = true;
		System.out.print(V + " ");
		
		if(V > arr.length - 1) {
			return;
		}
		
		for(int node = 1; node<arr.length; node++) {
			if(arr[V][node] == 1 && visited[node] == false) {
				dfs(node);
			}
		}
	}
	
	static void bfs(int V) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(V);
		visited[V] = true;
		System.out.print(V + " ");
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			for(int node = 1; node<arr.length; node++) {
				if(arr[temp][node] == 1 && visited[node] == false) {
					queue.add(node);
					visited[node] = true;
					System.out.print(node + " ");
				}
			}
		}
	}

}
