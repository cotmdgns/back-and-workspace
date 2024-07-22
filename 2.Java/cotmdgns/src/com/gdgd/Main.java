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
		String[] my_string ={"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4},{1, 2},{3, 5},{7,7}};
		System.out.println(m.solution(my_string,parts));
	}
	
	public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String[] str = my_strings;
        int count = 0;
        for(int i=0;i<parts.length;i++) {
        	for(int j=0;j<parts[i].length;j++) {
        		System.out.println(j);
        	}
        	System.out.println();
        }
        return answer;
    }
}

