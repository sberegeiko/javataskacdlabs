package com.company.examples.algorithms.recursia;

public class Fibbonachi {
	
	public static void main(String[] args) {
		for(int k = 0; k < 10; k++) {
			System.out.println("fib(" + k + ") = " + fib(k) + " | fibRecur(" + k + ") = " + fibRecur(k));
		}
	}
	
	private static int fibRecur(int arg){
		if(arg == 0) {
			return 1;
		} else if(arg == 1) {
			return 1;
		} else {
			return fibRecur(arg-2) + fibRecur(arg-1);
		}
	}

	private static int fib(int arg){
		if(arg == 0) {
			return 1;
		}
		if(arg == 1) {
			return 1;
		}
		int[] result = new int[arg + 1];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < result.length; i++) {
            result[i] = result[i-2] + result[i-1];
        }
		return result[arg];
	}
}
