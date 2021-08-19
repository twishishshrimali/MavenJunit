package com.twishish;

public class OddEven {
	

	int num1=20;
	public boolean isEvenNumber(int number){
		
		boolean result = false;
       if(number%2 == 0){
           result = true;
       }
       return result;
    }
	
	public boolean isOddNumber(int number){
		
		boolean result = false;
       if(number%2 != 0){
           result = true;
       }
       return result;
    }
	
}
