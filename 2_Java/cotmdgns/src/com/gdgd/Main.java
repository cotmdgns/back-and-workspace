package com.gdgd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		
		Main m = new Main();
		int a = 3;
		int b = 1;
		String c = "asdasdasdasdasd";
		
		
		
		System.out.println((m.solution(a,b,c)));
//		Arrays.toString
	}
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i<code.length();i+=q) {
        	System.out.println("몇번? : "+code.charAt(i) + i);
        }
        return answer;
    }
}

