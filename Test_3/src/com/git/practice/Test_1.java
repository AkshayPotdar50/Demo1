package com.git.practice;

public class Test_1 extends Exception {
	 //member variable to store our custom message
    String msg;
    Test_1(String msg){
        //passing the parameter to super class constructor
        super(msg);
        this.msg=msg;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
    
	

}
