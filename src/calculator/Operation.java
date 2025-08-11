package calculator;

public class Operation {
	public int add(int n1, int n2) {
		
		return n1+n2;
		
	}

	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	public int mult(int n1, int n2) { 
		// TODO Auto-generated method stub
		return n1*n2;
	}

	public int div(int n1, int n2) {
		try {
			if (n2 == 0) {
			 throw new ArithmeticException ("enter valid number");
			}
			return n1/n2;
		
		} catch (ArithmeticException e) {
			System.out.println("error: "+e.getMessage());
			
		}
		return 0;

		
	}
}
