import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
        int [][] arr = new int [n][n];
        
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = n*i+(j+1);
					bw.write(String.valueOf(arr[i][j]+" "));
				}
			}else if(i%2!=0) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = n*(i+1)-j;
					bw.write(String.valueOf(arr[i][j]+" "));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}