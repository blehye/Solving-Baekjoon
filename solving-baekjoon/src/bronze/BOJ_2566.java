package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2566 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		for(int i=0; i<9; i++) {
			String[] row = br.readLine().split(" ");
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		int maxNum = 0;
		int rowIdx = 0;
		int columnIdx = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(arr[i][j] > maxNum) {
					maxNum = arr[i][j];
					rowIdx = i;
					columnIdx = j;
				}
			}
		}
		
		System.out.println(maxNum);
		System.out.println((rowIdx + 1) + " " + (columnIdx + 1));

	}

}
