package com.twishish;

public class OddEven {
	

	int num1=20;
	public boolean isEvenNumber(int number){
		
		boolean result = false;
       if(number%2 == 0){
           result = true;
		System.out.println("Number is Even"); 
       }
       return result;
    }
	
	public boolean isOddNumber(int number){
		
		boolean result = false;
       if(number%2 != 0){
           result = true;
		System.out.println("Number is Odd");
       }
       return result;
    }
	
}
