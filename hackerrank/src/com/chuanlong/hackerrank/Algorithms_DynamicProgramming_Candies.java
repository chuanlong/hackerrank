package com.chuanlong.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Algorithms_DynamicProgramming_Candies {

	/**
	 * https://www.hackerrank.com/challenges/candies
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ratings = new int[n];
		for(int i=0; i<n; i++){
			ratings[i] = in.nextInt();
		}
		BigInteger minCandies = candy(ratings);
		System.out.println(minCandies);		
		in.close();
	}
	
    private static BigInteger candy(int[] ratings) {
        if(ratings == null || ratings.length == 0){
        	return new BigInteger("0");
        }
    	
        int[] candys = new int[ratings.length];
        candys[0] = 1;
        for(int i=1; i<candys.length; i++){
        	candys[i] = (ratings[i] > ratings[i-1]) ? candys[i-1]+1 : 1;
        }
        
        for(int i=candys.length-2; i>=0; i--){
        	candys[i] = (ratings[i] > ratings[i+1] && candys[i] < candys[i+1]+1) ? candys[i+1]+1 : candys[i]; 
        }
        
        BigInteger min = new BigInteger("0");
        for(int i=0; i<candys.length; i++){
        	min = min.add(new BigInteger(candys[i]+""));
        }
        return min;
    }

}
