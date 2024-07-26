package cotmdgns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class main {
	public static void main(String[] args) {
		
		main m = new main();
		
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
        
		System.out.println(Arrays.toString(m.solution(arr,delete_list)));
	}

	
	public int[] solution(int[] arr, int[] delete_list) {
		int[] answer = {};
        for(int i =0;i<arr.length;i++) {
        	for(int j=0;j<delete_list.length;j++) {
        		if(arr[i] == delete_list[j]) {
            		System.out.println(arr[j]);
            	}else {
            		break;
            	}
        	}
        }
        return answer;
    }
}
