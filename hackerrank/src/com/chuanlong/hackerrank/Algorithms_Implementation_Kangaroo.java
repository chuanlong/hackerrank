package com.chuanlong.hackerrank;

import java.util.Scanner;

public class Algorithms_Implementation_Kangaroo {

	/**
	 * https://www.hackerrank.com/challenges/kangaroo
	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean isMeet = isMeet(x1, v1, x2, v2);
        System.out.println(isMeet ? "YES" : "NO");
        in.close();
    }
    
    private static boolean isMeet(int x1, int v1, int x2, int v2){
    	
    	int distance, speed;
    	if(x1 > x2){
    		distance = x1 - x2;
    		speed = v2 - v1;
    	}else if(x2 > x1){
    		distance = x2 - x1;
    		speed = v1 - v2;
    	}else{
    		return true;
    	}
    	
    	if(speed > 0){
    		if(distance % speed == 0){
    			return true;
    		}else{
    			return false;
    		}
    	}else{
    		return false;
    	}
    }

}
