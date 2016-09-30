package com.chuanlong.hackerrank;

import java.util.Scanner;

public class Algorithms_DynamicProgramming_TheMaximumSubarray {

	/**
	 * https://www.hackerrank.com/challenges/maxsubarray
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		for(int i=0; i<m; i++){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int j=0; j<n; j++){
				arr[j] = in.nextInt();
			}
			
			int max1 = getMaximumSubarray(arr);
			int max2 = getMaximumSubsequences(arr);
			System.out.println(max1 + " " + max2);
		}
		in.close();
		
	}
	
	
	private static int getMaximumSubarray(int[] a){
		int[] maxIn = new int[a.length];
		int[] maxEnd = new int[a.length];
		
		maxEnd[0] = a[0];
		maxIn[0] = a[0];
		
		for(int i=1; i<a.length; i++){
			maxEnd[i] = Math.max(maxEnd[i-1] + a[i], a[i]);
			maxIn[i] = Math.max(maxEnd[i], maxIn[i-1]);
		}		
		return maxIn[a.length-1];
	}
	
	private static int getMaximumSubsequences(int[] a){
		int sum = a[0];
		for(int i=1; i<a.length; i++){
			if(sum > 0){
				if(a[i] > 0){
					sum += a[i];
				}
			}else{
				sum = sum > a[i] ? sum : a[i];
			}
		}
		return sum;
	}

}
