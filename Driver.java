public class Driver{
    public static void main(String[] args){
	double[] d = {3,4,5,6};
	Polynomial p = new Polynomial(d);
	System.out.println(p);
	Polynomial p2 = new Polynomial(3);
	System.out.println(p2);
    }
}