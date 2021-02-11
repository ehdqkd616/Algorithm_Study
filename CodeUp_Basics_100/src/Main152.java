import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String[] strArr = new String[2];
        strArr = br.readLine().split(" ");
        
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);
		int sum = n*m;
		
        int [][] arr = new int [n][m];
        
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sum;
				bw.write(String.valueOf(arr[i][j]+" "));
				sum--;
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}