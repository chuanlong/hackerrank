package com.chuanlong.hackerrank.airbnb;

import com.chuanlong.hackerrank.airbnb.bean.Node;

public class Q2_ElementPresentInTree {

	/**
	 * https://www.hackerrank.com/tests/52d6d0953bddb/questions/1d1bn4gsl
	 */
	public static void main(String[] args) {
		
		isPresent(null, 0);
	}
	
	
	
	private static int isPresent(Node root, int val){
		if(root == null){
			return 0;
		}
		
		if(val < root.data){
			return isPresent(root.left, val);
		}else if(val > root.data){
			return isPresent(root.right, val);
		}else{
			return 1;
		}
	}

}
