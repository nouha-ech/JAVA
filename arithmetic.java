package arith;
import java.util.Stack;

public class arithmetic {
	
	    public static int calculer(int a, int b, char operateur) {
	        switch (operateur) {
	            case '+': return a + b;
	            case '-': return a - b;
	            case '*': return a * b;
	            case '/': return a / b;
	            default: throw new UnsupportedOperationException("Opérateur non supporté : " + operateur);
	        }
	    }

	    public static int evaluerExpression(String expression) {
	        Stack<Integer> operandes = new Stack<>();
	        Stack<Character> operateurs = new Stack<>();

	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);

	            if (Character.isDigit(ch)) {
	                operandes.push(ch - '0');
	            } else if (ch == '(') {
	                operateurs.push(ch);
	            } else if (ch == ')') {
	                while (operateurs.peek() != '(') {
	                    int b = operandes.pop();
	                    int a = operandes.pop();
	                    char op = operateurs.pop();
	                    operandes.push(calculer(a, b, op));
	                }
	                operateurs.pop();
	            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                while (!operateurs.isEmpty() && precedence(operateurs.peek()) >= precedence(ch)) {
	                    int b = operandes.pop();
	                    int a = operandes.pop();
	                    char op = operateurs.pop();
	                    operandes.push(calculer(a, b, op));
	                }
	                operateurs.push(ch);
	            }
	        }

	        while (!operateurs.isEmpty()) {
	            int b = operandes.pop();
	            int a = operandes.pop();
	            char op = operateurs.pop();
	            operandes.push(calculer(a, b, op));
	        }

	        return operandes.pop();
	    }

	    public static int precedence(char operateur) {
	        if (operateur == '+' || operateur == '-') return 1;
	        if (operateur == '*' || operateur == '/') return 2;
	        return -1;
	    }

	    public static void main(String[] args) {
	        String expression = "(4+5)";
	        int resultat = evaluerExpression(expression);
	        System.out.println("Le résultat de l'expression est : " + resultat);
	    }
	}

