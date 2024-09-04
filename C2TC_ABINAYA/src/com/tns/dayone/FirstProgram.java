package com.tns.dayone;
public  class FirstProgram  {
	public static void main(String[] args) {
	int a=5;
	int b=3,max;
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	
	
	//Arithmetic Operators
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	                //Relational Operators
	// ‘Equal to’ operator
	System.out.println("a == b:"+ (a == b));
	 //‘not Equal to’ operator
	System.out.println("a != b: "  + (a != b));
	//‘Greater than’ operator
	System.out.println("a > b: " + (a > b));
	// 'Greater than or equal to
	System.out.println("a >= b: " + (a >= b));
	// ‘Less than’ Operator
	System.out.println("a < b: " + (a < b));
	// ‘Less than or equal to’ Operator
	System.out.println("a <= b: " + (a <= b));
	      //Assignment Operators
	// equal assign	
	System.out.println("a is assigned: " + a);
	System.out.println("b is assigned: " + b);
	//+= assign
	a += b;
	//-=assign
	a -= b;
	//*=assign
	a *= b;
	// /= assign
	a /= b;
	// %= assign
	a %= b;
	        //   Ternary operator
	 max= (a > b) ? a : b;

    // Print the largest number
    System.out.println("minimum is = " + max);
    boolean condition = true;
    String result = (condition) ? "True" : "False";
  
    System.out.println(result);
	
	        
	    }	

	}
	
