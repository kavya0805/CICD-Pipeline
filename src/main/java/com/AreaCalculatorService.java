package com;

public class AreaCalculatorService {

	public double square(int r)
    {
        return r * r;
    }
	
	public double rectangle(int r, int h)
    {
        return r * h;
    }
	
	public double circle(int r)
    {
        return Math.PI * r * r;
    }
}
