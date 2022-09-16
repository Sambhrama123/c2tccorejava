package com.cg.calculate;

public class Sum{

	int a = 20; 
    int b = 30; 
    public void cal()
    {
    	int s =a+b;
    	  System.out.println("Sum: " +s);
    }
    class SumTest {
    	
    }
	public static void main(String[] args) {
		Sum s= new Sum();
		s.cal();
	}

}
