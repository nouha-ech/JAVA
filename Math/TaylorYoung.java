package Etu;

public class TaylorYoung {

	    public static double f(double x) {  // f(x)= e(x)
	        return Math.exp(x);
	    }

	    public static double deriv(int n, double x) { // f'(x)= e(x)
	        return Math.exp(x);
	    }

	    public static double taylorTerm(int n, double a, double x) {
	        double valeurDerivEnA = deriv(n, a);  // derive de fx au point a 
	        double fact = fact(n);              
	        return valeurDerivEnA / fact * Math.pow(x - a, n);
	    }

	    public static double fact(int n) {   // factoriel
	        double f = 1;
	        for (int i = 1; i <= n; i++) {
	            f *= i;
	        }
	        return f;
	    }

	    public static double taylorApprox(double x, double a, int o) {
	        double sum = 0;
	        for (int n = 0; n <= o; n++) {
	            sum += taylorTerm(n, a, x);
	        }
	        return sum;
	    }

	    public static double calcLim(double a, double x, int o) {
	        return taylorApprox(x, a, o);
	    }

	    public static void main(String[] args) {
	        double a = 1.0;
	        double x = 1.0001;
	        int o = 10;
	        int o2 = 2;
	        
	        double b = 2.0;
	        
	        double c = 0;

	        double limApprox = calcLim(a, x, o);
	        System.out.println("Approx lim quand x tend vers " + a + " : " + limApprox);
	        
	        double approx2 = calcLim(b, x, o2);
	        System.out.println("approx lim quand x tend vers" + b + " : " + approx2);
	        double approx3 = calcLim(c, x, o2);
	        System.out.println("approx lim quand x tend vers " + c + " : " + approx3);
	    }
	}
