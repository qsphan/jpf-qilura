package plas;

/*
 * Toy program from paper of Meng et. al: "Calculating bounds on
 * information leakage using two-bit patterns"
 */

public class ImplicitFlow {
	
	public int func(int H){
		int O;
		if (H == 0) O = 0;
		else if (H == 1) 
		{	
			O = 1;
			// assert false;
		}
		else if (H == 2) O = 2;
		else if (H == 3) O = 3;
		else if (H == 4) O = 4;
		else if (H == 5) O = 5;
		else if (H == 6) O = 6;
		else O = 0;
		return O;		
	}
	
	public static void main(String[] args) {
		ImplicitFlow o = new ImplicitFlow();
		o.func(1);
	}
}
