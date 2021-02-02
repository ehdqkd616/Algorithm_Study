import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main98 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String[] arr = new String[2];
        arr = br.readLine().split(" ");
        
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		float max = 0;
		
		int plus, minus, multiple, division, power1, power2;
		
		plus = a+b;
		minus = a-b;
		multiple = a*b;
		division = a/b;
		power1 = (int) Math.pow(a, b);
		power2 = (int) Math.pow(b, a);
				
		max = ((((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) >= division ? ((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) : division) >= power1 ? (((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) >= division ? ((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) : division) : power1) >= power2 ? (((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) >= division ? ((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) : division) >= power1 ? (((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) >= division ? ((plus >= minus ? plus : minus) >= multiple ? (plus >= minus ? plus : minus) : multiple) : division) : power1 : power2;
				
		System.out.printf("%.6f", max);
		br.close();
		
	}

}
