package com.chuanlong.hackerrank.airbnb;

import java.util.Scanner;

public class Q3_SpiralMatrix {

	/**
	 * https://www.hackerrank.com/tests/52d6d0953bddb/questions/52d60f3d9843b
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String[] line1 = in.nextLine().split(",");
		int row = Integer.parseInt(line1[0]);
		int column = Integer.parseInt(line1[1]);
		
		String[][] n = new String[row][column];
		
		for(int i=0; i<row; i++){
			String[] tokens = in.nextLine().split(",");
			for(int j=0; j<column; j++){
				n[i][j] = tokens[j];
			}
		}
		in.close();

		// print String[][] n
		if(row != 0 && column != 0){

			final int RIGHT = 1, DOWN = 2, LEFT = 3, UP = 4;
			
			System.out.print(n[0][0]);
			n[0][0] = null;
			int i=0, j=0;
			int direct = RIGHT;
			
			while(true){
				if(direct == RIGHT){
					if(j+1 < n[i].length && n[i][j+1] != null){
						System.out.print("," + n[i][j+1]);
						n[i][j+1] = null;
						j = j+1;
					}else{
						if(n[i+1][j] != null){
							direct = DOWN;
						}else{
							break;
						}
					}
				}else if(direct == DOWN){
					if(i+1 < n.length && n[i+1][j] != null){
						System.out.print("," + n[i+1][j]);
						n[i+1][j] = null;
						i = i+1;
					}else{
						if(n[i][j-1] != null){
							direct = LEFT;
						}else{
							break;
						}
					}
				}else if(direct == LEFT){
					if(j-1 >= 0 && n[i][j-1] != null){
						System.out.print(","+n[i][j-1]);
						n[i][j-1] = null;
						j = j-1;
					}else{
						if(n[i-1][j] != null){
							direct = UP;
						}else{
							break;
						}
					}
				}else if(direct == UP){
					if(i-1 >= 0 && n[i-1][j] != null){
						System.out.print("," + n[i-1][j]);
						n[i-1][j] = null;
						i = i-1;
					}else{
						if(n[i][j+1] != null){
							direct = RIGHT;
						}else{
							break;
						}
					}
				}
			}
			System.out.println();
		}
		
		
	}

	
	

}
