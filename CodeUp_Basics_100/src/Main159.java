import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main159 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String StrArr[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(StrArr[0]);
		int m = Integer.parseInt(StrArr[1]);
		
        int [][] arr = new int [n][m];
        
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(n%2==0) {
					if(i%2==0) {
						arr[i][j] = (n-i)*(m)+(j+1-m);
					}else if(i%2!=0) {
						arr[i][j] = (n-i)*(m)-(j);
					}
					bw.write(String.valueOf(arr[i][j]+" "));
				}else if(n%2!=0) {
					if(i%2==0) {
						arr[i][j] = (n-i)*(m)-(j);
					}else if(i%2!=0) {
						arr[i][j] = (n-i-1)*(m)+(j+1);
					}
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