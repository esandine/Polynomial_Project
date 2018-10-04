public class Driver{
    public static void main(String[] args){
	double[] d = {3,4,5,6};
	Polynomial p = new Polynomial(d);
	System.out.println(p);
	Polynomial p2 = new Polynomial(3);
	System.out.println(p2);
	Polynomial p3 = new Polynomial(Polynomial.add(p,p2));
	System.out.println("Their sum:");
	System.out.println(p3);
	double[] d2 = {3,4,5};
	Polynomial p4 = new Polynomial(d2);
	System.out.println(p4);
	System.out.println("Their sum:");
	p4.add(p3);
	System.out.println(p4);
	p4.monomialmult(2);
	System.out.println("Multiplied by x^2:");
	System.out.println(p4);
    }
}