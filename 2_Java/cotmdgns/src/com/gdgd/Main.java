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
		String c = "baconlettucetomato";
		
		
		
		System.out.println((m.solution(c)));
//		Arrays.toString
	}
    public String[] solution(String myStr) {
        String[] answer = {};
        
        for(int i=0;i<myStr.length();i++) {
        	if(myStr.charAt(i) == 'a') {
        		answer = myStr.split("a");
        		
        	}
        }        
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}

