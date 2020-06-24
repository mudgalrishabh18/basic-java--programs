package flowcontrol;

public class Prime {
	void findprime(int x) {
		int flag=0,i;
		for(i=2;i<x;i++) {
			if(x%i==0) {
				flag++;
			}
		}if(flag==0) {
			System.out.println("It is prime number");
		}else {
			System.out.println("It is not a prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime obj=new Prime();
		obj.findprime(7);

	}

}
