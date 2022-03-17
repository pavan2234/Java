package org.techouts;

public class ContinueWhile {

	public static void main(String[] args) {
		 int i=1;  
		    while(i<=10){  
		        if(i==5){  
		            //using continue statement  
		            i++;  
		            continue;//it will skip the rest statement  
		        }  
		        System.out.println(i);  
		        i++;  
		    }  
	}

}
