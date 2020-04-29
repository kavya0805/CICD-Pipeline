package com;


public class CalculatorService {

	
	public int Sum(int a, int b){
		return a+b;
	}
	
	
	public int Diff(int a, int b){
		return a-b;
	}
	
	
	public int Mul(int a, int b){
		return a*b;
	}
	
	
	public int Mod(int a, int b){
		return a%b;
	}
	

	
	public boolean Equal(int a, int b){
		return ((a == b) ? true:false);
	}
	
	
}
