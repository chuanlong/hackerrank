package com.chuanlong.hackerrank;

import java.util.Scanner;

public class Algorithms_Warmup_SimpleArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
        	sum+= arr[i];
        }
        System.out.println(sum);
	}

}
