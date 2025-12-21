/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
*/


import java.util.Scanner;
public class Quadratic{
	
	//Method to find roots of quadratic equation 
	public int[] findRoots(int a, int b, int c){
		int delta = b*b + 4 * a * c;
		int sqrtDelta = (int)Math.sqrt(delta);
		int root=0, root1=0, root2=0;	
		if(delta > 0){
			root1 = (-b + sqrtDelta)/(2*a); 
			root2 = (-b - sqrtDelta)/(2*a);
		}
		else if(delta == 0){
			root = -b/(2*a);
		}
		else {
            		System.out.println("Roots are imaginary");
        	}
		return new int[]{root, root1, root2}; 	
	}
	
	
	public static void main(String[] args){

		//Taking inputs
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number A :");
		int a = sc.nextInt();
		System.out.print("Enter a number B :");
		int b = sc.nextInt();
		System.out.print("Enter a number C :");
		int c = sc.nextInt();

				
		//creating object
		Quadratic obj = new Quadratic();
			
		//calling method 
		int roots[] = obj.findRoots(a,b,c);	
	
		//Display roots
		System.out.println("Root for given values of quadratic equatin are : ");
		for(int i=0; i<roots.length; i++){
			if (roots[i] != 0){
                		System.out.println(roots[i]);
        		}
		}
		sc.close();
	}
}