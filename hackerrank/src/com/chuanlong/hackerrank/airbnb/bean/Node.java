package com.chuanlong.hackerrank.airbnb.bean;

public class Node {
	public Node left, right;
	public int data;
    
	public Node(int newData) {
		left = right = null;
		data = newData;
	}
}
