import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
        int [][] arr = new int [n][n];
        
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j%2==0) {
					arr[i][j] = n*(j+1)-(i);
				}else if(j%2!=0) {
					arr[i][j] = n*(j)+(i+1);
				}
				bw.write(String.valueOf(arr[i][j]+" "));
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}