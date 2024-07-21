package com.gdgd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2;
	
		int[] answer = new int[num_list.length-(n-1)];

		System.arraycopy(num_list,n-1,answer,0,num_list.length-(n-1));
		System.out.println(Arrays.toString(answer));
	}
}

