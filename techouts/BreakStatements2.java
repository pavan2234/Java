package org.techouts;

public class BreakStatements2 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++){    
            for(int j=1;j<=3;j++){    
                if(i==2&&j==2){    
                 break;
                }  
                  
                System.out.println(i+" "+j);    
            } 
          
   
	}

	}
}
//the break will stop the process at the particular loop only