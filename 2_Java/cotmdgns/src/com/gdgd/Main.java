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
		String binomial ="43 + 12";
		
		
		System.out.println((m.solution(binomial)));
//		Arrays.toString
	}
	public int solution(String binomial) {
        int answer = 0;
        String[] str = binomial.split(" ");
        int number1 = Integer.parseInt(str[0]);
        int number2 = Integer.parseInt(str[2]);
        return answer;
    }
	
}

