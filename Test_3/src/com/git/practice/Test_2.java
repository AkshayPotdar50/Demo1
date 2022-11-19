package com.git.practice;

public class Test_2{
	public static void main(String[] args) {
	    try{
	        throw new Test_1("User-defined exception demonstration");
	    }
	    catch(Test_1 ex){
	        //calls override toString() method
	        System.out.println(ex);
	        //prints message passed to the super constructor
	        System.out.println(ex.getMessage());
	    }
	}
}