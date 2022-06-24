package com.revature;

public class Launcher {
	public static void main(String[] args) {
		System.out.println(sherlock(3,9));
		System.out.println(sherlock(17,24));
		System.out.println(sherlock(1,1000000000));
	}
	
	public static int sherlock(double a, double b) {
//This is too slow...
//		int result = 0;
//		System.out.println(Math.sqrt(a));
//		System.out.println(Math.floor(a));
//		while(a <= b) {
//			double squareRoot = Math.sqrt(a);
//			if(squareRoot - Math.floor(squareRoot) ==0) {
//				result++;
//				a++;
//			}else {
//				a++;
//			}
//		} 
		
		
//Cast to int to make result pretty
		return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
	
	}
	
}
