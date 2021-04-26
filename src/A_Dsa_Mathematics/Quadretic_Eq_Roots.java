package A_Dsa_Mathematics;
import java.util.*;
public class Quadretic_Eq_Roots {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the input of a = ");
		int a = scn.nextInt();
		System.out.println("Enter the input of b = ");
		int b = scn.nextInt();
		System.out.println("Enter the input of c = ");
		int c = scn.nextInt();
		
		scn.close();
		
		
	quadretic_roots(a,b,c);
	}

	 static void quadretic_roots(int a, int b, int c) {
		int root1=0; int root2=0;
		int temp=0;
		temp = (int)(Math.pow(b,2)-4*a*c);
		
		if(temp<0) {
			System.out.println("Roots are Imaginary");
		}else {
			root1= (int)(Math.floor((-1*b)+Math.sqrt(temp))/(2*a));
			root2= (int)(Math.floor((-1*b)-Math.sqrt(temp))/(2*a));
			System.out.print("The Roots are : ");
			System.out.print(Math.max(root1, root2)+" "+Math.min(root1, root2));
		}
		
	}

	
		
	}


