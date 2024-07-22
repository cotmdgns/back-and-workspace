package com.gdgd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		
		Main m = new Main();
		int start_num = 10;
		int end_num = 3;
		System.out.println(Arrays.toString(m.solution(start_num,end_num)));
	}
	
	public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int count =0;
        for(int i = 1;i<=n;i++) {
        	if(i % k == 0) {
        		answer[count++] += i;
        	}
        }
        return answer;
    }
}

