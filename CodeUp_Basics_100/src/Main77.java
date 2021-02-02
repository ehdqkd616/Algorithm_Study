import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main77 { // 성실한 개미, 시간초과 코드

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int secondArr[][] = new int[11][11];
		String [] firstArr = new String[10];
		
		for(int i = 1; i<11; i++) {
			firstArr = br.readLine().split(" ");
			for(int j = 1; j<11; j++) {
				secondArr[i][j] = Integer.parseInt(firstArr[j-1]);
			}
		}
		
		boolean flag = true;
		int x = 2;
		int y = 2;
		
		while(flag) {
			for(int i = x; i < 11; i++) {
				for(int j = y; j < 11; j++) {
					if(secondArr[i][j] == 0) {
						secondArr[i][j] = 9;
						y++;
					} else if(secondArr[i][j] == 1) {
						x++;
						y--;
						break;
					} else if(secondArr[i][j] == 2) {
						secondArr[i][j] = 9;
						flag = false;
					}
				}
				if(!flag) break;
			}
		}
		
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				bw.write(String.valueOf(secondArr[i][j]+" "));
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}