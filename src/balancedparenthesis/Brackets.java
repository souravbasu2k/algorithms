package balancedparenthesis;

import java.util.Stack;

public class Brackets {
	
	public static void main(String[] args) {
		/*String input = " [(a+b)*c]";
		System.out.println(input+": "+isBalanced(input));*/
		
		String input2 = "[(a+b)*c}";
		System.out.println(input2+": "+isBalanced(input2));
	}
	
	public static boolean isBalanced(String input){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<input.length(); i++) {			
			if(input.charAt(i)=='(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
				stack.push(input.charAt(i));
			} else if(input.charAt(i)==')') {
				if(!stack.isEmpty() && stack.pop()!='(')
					return false;
			} else if(input.charAt(i)=='}') {
				if(!stack.isEmpty() && stack.pop()!='{')
					return false;
			} else if(input.charAt(i)==']') {
				if(!stack.isEmpty() && stack.pop()!='[')
					return false;
			}			
		}
		return stack.isEmpty();
	}	

}
