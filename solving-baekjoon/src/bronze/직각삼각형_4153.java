package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 직각삼각형_4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] numStr = br.readLine().split(" "); 
			
			int[] num = new int[numStr.length];
			
			for(int i=0; i<numStr.length; i++) {
				num[i] = Integer.parseInt(numStr[i]); 
			}
			
			Arrays.sort(num);
			
			String result = "";
			if((num[0] * num[0]) + (num[1] * num[1]) == (num[2] * num[2]) && (num[0]!=0 && num[1]!=0 && num[2]!=0)) {
				result = "right";
			}else if(num[0]==0 && num[1]==0 && num[2]==0) {
				break;
			} else {
				result = "wrong";
			}
			
			System.out.println(result);
			
		}

	}

}
