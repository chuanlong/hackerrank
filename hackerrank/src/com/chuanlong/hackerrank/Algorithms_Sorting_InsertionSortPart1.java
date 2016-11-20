package com.chuanlong.hackerrank;

public class Algorithms_Sorting_InsertionSortPart1 {

	/**
	 * https://www.hackerrank.com/challenges/insertionsort1
	 */
	public static void main(String[] args) {

	}
	
    public static void insertIntoSorted(int[] ar) {
    	int key = ar[ar.length-1];
    	for(int i=ar.length-2; i>=-1; i--){
    		if(i == -1){
    			ar[0] = key;
        		printArray(ar);
    		}else{
        		if(ar[i] > key){
        			ar[i+1] = ar[i];
            		printArray(ar);
        		}else{
        			ar[i+1] = key;
            		printArray(ar);
            		break;
        		}
    		}
    	}
    }
    
    private static void printArray(int[] ar) {
        for(int i=0; i<ar.length; i++){
            int n = ar[i];
        	System.out.print(n+" ");
        }
        System.out.println("");
    }

}
