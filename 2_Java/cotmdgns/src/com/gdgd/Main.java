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
		int a = 5;
		int b = 3;
		int c = 3;
		
		System.out.println((m.solution(a,b,c)));
//		Arrays.toString
	}
    public int solution(int a, int b, int c) {
    	int answer = 0;
    	if(a != b && b != c && c != a) {
    		answer += a+b+c;
    	}else if((a == b && b != c) ||(b == c && c != a) || (c == a && a != b)) {
    		answer += (a+b+c) * (a*a + b*b +c*c);
    	}else if((a == b && b== c)){
    		answer += (a+b+c) * (a*a + b*b + c*c) * ((a*a*a) + (b*b*b) + (c*c*c));
    	}
        return answer;
    }
}

