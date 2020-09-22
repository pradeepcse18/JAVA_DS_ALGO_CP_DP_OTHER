package traversal;

import java.util.Stack;

public class PostFixTraversal {

	public static void main(String[] args) {
		char charArr[] = new char[] { '9', '2', '3', '+', '*' };
		System.out.println(printPostTravSol(charArr));

	}
	private static int printPostTravSol(char[] charArr) {
		String operations = "+-*/";
		Stack<String> stack = new Stack<String>();
		for (char ch : charArr) {
			String val = String.valueOf(ch);
			if (!operations.contains(val)) {
				stack.push(val);
			} else {
				int a = Integer.parseInt(stack.pop());
				int b = Integer.parseInt(stack.pop());
				switch (val) {
				case "+":
                    stack.push(String.valueOf(a+b));
					break;

				case "-":
					 stack.push(String.valueOf(b-a));
					break;
				case "*":
					 stack.push(String.valueOf(a*b));
					break;
				case "/":
					 stack.push(String.valueOf(b/a));
					break;
				}
			}

		}
		return Integer.parseInt(stack.pop());
	}

}
