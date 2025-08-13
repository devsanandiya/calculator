package calculator;

import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Operation op = new Operation();
		
		while(true) {
         int number , n1 = 0,n2 = 0;
         
         
        
         System.out.println("choose operation ");
         System.out.println("1.add(+)");
         System.out.println("2.sub(-)");
         System.out.println("3.mult(*)");
         System.out.println("4.div(/)");
         System.out.println("enter you choice(1-5): ");
         int choice = sc.nextInt();
         if(choice<5) {
        	 
        	 
         }else {
        	 System.out.println("enter valid choice " );
        	 continue;
         }
    
         
         System.out.println("enter your first number  : "); 
         
         n1=sc.nextInt();
         
         System.out.println("enter your second number : ");
         
         n2=sc.nextInt();
         
         
         
         
         double result = 0;
         boolean success = true;
         
         switch(choice) {
         case 1 :
        	
			result= op.add(n1, n2);
			     System.out.println("result: "+result);
			     break;
         case 2 : 
        	 
        	 result=op.sub(n1,n2);
        	 System.out.println("result: "+result);
        	 break;
         case 3 :
        	 
        	 result=op.mult(n1,n2);
        	 System.out.println("result : "+result);
        	 break;
         case 4:
        	 result=op.div(n1,n2);
        	 System.out.println("result: "+result);
        	  if (n2==0) {
        		  success=false;
        		  
        	  }
        	 
        	 break;
         case 5:
        	 System.out.println("exti calculator");
        	 return;
        	 
        default:
        	System.out.println("enter valid choice");
        
     } 
         sc.close();
 
   }     
 }
}

   
 