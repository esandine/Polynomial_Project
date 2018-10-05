public class Driver{
    public static void main(String[] args){
	double[] d = {1,1,1,1,1,1};
	Polynomial p1 = new Polynomial(d);
	double[] d2 = {-1,1,0,0,0,0,0};
	Polynomial p2 = new Polynomial(d2);
	System.out.println(p1);
	System.out.println(p2);
	Polynomial p3 = new Polynomial(Polynomial.mult(p1,p2));
	System.out.println("Multiplying the polynomials");
	System.out.println(p3);
    }
}