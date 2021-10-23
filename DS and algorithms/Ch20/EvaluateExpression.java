package Ch20;
import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(args.length !=1) {
//			System.out.println("usage: java EvaluateExpression \"expression\"");
//			System.exit(1);
//		}
//		try {
//			System.out.println(evaluateExpression(args[0]));
//		}
//		catch(Exception ex) {
//			System.out.println("wrong expression: "+args[0]);
//		}
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an expression: (eg (3+2)*5");
		String str = in.next();
		evaluateExpression(str);
		
	}
	
	@SuppressWarnings("removal")
	public static int evaluateExpression(String expression) {
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();
		
		//insert blanks around (,), +, -, /, *
		expression = insertBlanks(expression);
		String[] tokens = expression.split("");
		
		for(String token: tokens) {
			if(token.length() == 0)//blank space
				continue;
			else if(token.charAt(0) == '+' || token.charAt(0) == '-') {
				while(!operatorStack.isEmpty() && 
						(operatorStack.peek() == '+' ||
						operatorStack.peek() == '-' ||
						operatorStack.peek() == '*' ||
						operatorStack.peek() == '/' )) {
					processAnOperator(operandStack, operatorStack);
				}
				operatorStack.push(token.charAt(0));
			}
			else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
		        // Process all *, / in the top of the operator stack 
		        while (!operatorStack.isEmpty() &&
		          (operatorStack.peek() == '*' ||
		          operatorStack.peek() == '/')) {
		          processAnOperator(operandStack, operatorStack);
		        }

		        // Push the * or / operator into the operator stack
		        operatorStack.push(token.charAt(0));
		      }
		      else if (token.trim().charAt(0) == '(') {
		        operatorStack.push('('); // Push '(' to stack
		      }
		      else if (token.trim().charAt(0) == ')') {
		        // Process all the operators in the stack until seeing '('
		        while (operatorStack.peek() != '(') {
		          processAnOperator(operandStack, operatorStack);
		        }
		        
		        operatorStack.pop(); // Pop the '(' symbol from the stack
		      }
		      else { // An operand scanned
		        // Push an operand to the stack
		        operandStack.push(new Integer(token));
		      }
		    }

		    // Phase 2: process all the remaining operators in the stack 
		    while (!operatorStack.isEmpty()) {
		      processAnOperator(operandStack, operatorStack);
		    }

		    // Return the result
		    return operandStack.pop();
		
	}
	
	public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack) {
		char op = operatorStack.pop();
		int op1 = operandStack.pop();
		int op2 = operandStack.pop();
		if (op == '+') 
		      operandStack.push(op2 + op1);
		    else if (op == '-') 
		      operandStack.push(op2 - op1);
		    else if (op == '*') 
		      operandStack.push(op2 * op1);
		    else if (op == '/') 
		      operandStack.push(op2 / op1);
	}
	
	public static String insertBlanks(String s) {
		String result = "";
		for (int i =0; i<s.length();i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' ||
				s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
				result += " "+s.charAt(i)+" ";
			else 
				result += s.charAt(i);
		}
		return result;
	}
}
