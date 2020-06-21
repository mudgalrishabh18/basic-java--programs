//This is a program to check whether a number is odd or even.
package flowcontrol;

public class OddEven {
	//private int x;
	void check(int x) {
		if(x%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
	

	public static void main(String[] args) {
		OddEven obj=new OddEven();
		obj.check(5);
		

	}

}
