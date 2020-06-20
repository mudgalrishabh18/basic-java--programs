// Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 
package flowcontrol;

public class LastDigit {
	public boolean lastDigit(int a, int b) {
		   int digit1=a%10;
		   int digit2=b%10;
			   if (digit1==digit2) {
		    	   return true;
		    	  }else {
		    		  return false;
		    	  
			   
		   }
		       
		}
	

	public static void main(String[] args) {
		LastDigit obj=new LastDigit();
		//obj.lastDigit(5, 15);
		if(obj.lastDigit(565,135265)==true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		

	}

}
