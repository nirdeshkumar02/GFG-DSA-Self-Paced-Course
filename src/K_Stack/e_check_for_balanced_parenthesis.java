package K_Stack;
import java.util.*;
public class e_check_for_balanced_parenthesis {

	public static void main(String[] args) {
		String str = "({[{]}})";
		if(isBalanced(str))
			System.out.println("Given Parenthesis is balanced");
		else
			System.out.println("Given Parenthesis is not balanced");
	}

	public static boolean isBalanced(String str) {
		Stack<Character> s = new Stack<Character>();
		for(int i = 0; i< str.length(); i++) {
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				s.push(str.charAt(i));
			}
			else {
				if(s.isEmpty() == true) {
					return false;
				}
				else if (matching(s.peek(), str.charAt(i))==false){
					return false;
				}
				else
					s.pop();
			}
		}
		return (s.isEmpty()==true);
	}

	private static boolean matching(Character a, char b) {
		
		return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
	}

}
