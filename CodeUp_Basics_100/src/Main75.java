import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main75 { // 십자 뒤집기

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n, x, y;
		int a[][] = new int[20][20];
		String [] arr = new String[20];
		String [] arr2 = new String[2];
		
		for(int i = 1; i < 20; i++) {
			arr = br.readLine().split(" ");
			for(int j = 1; j < 20; j++) {
				a[i][j] = Integer.parseInt(arr[j-1]);				
			}
		}		
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr2 = br.readLine().split(" ");
			x = Integer.parseInt(arr2[0]);
			y = Integer.parseInt(arr2[1]);
			for(int j = 1; j < 20; j++) {
				if(a[x][j]==0) {
					a[x][j] = 1;
				}else {
					a[x][j] = 0;
				}
				
			}
			for(int j = 1; j < 20; j++) {
				if(a[j][y]==0) {
					a[j][y] = 1;
				}else {
					a[j][y] = 0;
				}
			}
		}
				
		for(int i = 1; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				bw.write(String.valueOf(a[i][j]+" "));
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}