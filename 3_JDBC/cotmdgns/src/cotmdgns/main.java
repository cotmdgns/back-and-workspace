package cotmdgns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import javax.annotation.processing.SupportedSourceVersion;

public class main {
	public static void main(String[] args) {
		
		main m = new main();
		
		int[] arr = {444, 555, 666, 777};
		int n = 27;
		
		
		System.out.println(Arrays.toString(m.solution(arr,n)));
//		Arrays.toString

	}
	public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        if(answer.length % 2 == 1) 
        	for(int i = 0;i<answer.length; i+=2) answer[i] = answer[i] + n;
        if(answer.length % 2 == 0) 
        	for(int i = 1;i<answer.length; i+=2) answer[i] = answer[i] + n;
        return answer;
    }
}


