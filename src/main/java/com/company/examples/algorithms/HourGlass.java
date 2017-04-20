package com.company.examples.algorithms;

public class HourGlass {	
	public static void main(String[] args) {
		int[][] matrix = new int[20][20];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {				
				if ( ((j >= i) && (j <= matrix.length-1-i))
						|| ((j <= i) && (j >= matrix.length-1-i)) ) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
				System.out.print(matrix[i][j]);				
			}
			System.out.println();
		}		
	}	
}
