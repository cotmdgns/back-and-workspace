package cotmdgns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class main {
	public static void main(String[] args) {
		
		main m = new main();
		int a = 2;
		int b = 91;
		System.out.println(m.solution(a, b));
	}

	
	public int solution(int a, int b) {
        int answer = 0;
        String numStr = String.valueOf(a) + b;
        int num = 2 * a * b;
        System.out.println(numStr);
        System.out.println(num);
//        if(num > numStr) {
//        	
//        }
        return answer;
    }
}
