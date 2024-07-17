package cotmdgns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter br2 = new BufferedWriter(new OutputStreamWriter(System.out)); 
		try {
			int gil = Integer.parseInt(br.readLine());
			for(int i=0;i<gil; i++) {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				System.out.println(a + b);
			}
		} catch (Exception e) {
		}
	}
}
