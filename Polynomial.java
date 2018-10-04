import java.lang.Math;
public class Polynomial{
    //variables
    private int degree;
    private double[] coefficients;
    //mutators
    public void setDegree(int x){
	this.degree=x;
    }
    public void setCoefficient(int degree, double coef){
	this.coefficients[degree]=coef;
    }
    public void setCoefficients(double[] coefficients){
	this.coefficients=coefficients;
	this.degree=coefficients.length-1;
    }
    //accessors
    public int getDegree(){
	return this.degree;
    }
    public double getCoefficient(int degree){
	return this.coefficients[degree];
    }
    public double[] getCoefficients(){
	return this.coefficients;
    }
    //constructors
    public Polynomial(double[] coefficients){
	setCoefficients(coefficients);
    }
    public Polynomial(int degree){
	setDegree(degree);
	setCoefficients(new double[degree+1]);
    }
    public Polynomial(Polynomial p){
	setDegree(p.getDegree());
	setCoefficients(p.getCoefficients());
    }
    //stringification
    public String toString(){
	String retstr = "";
	for(int i=0; i<=degree; i++){
	    retstr +=getCoefficient(degree-i);
	    retstr +="x^";
	    retstr += degree-i;
	    if(i<degree){
		retstr +=" + ";
	    }
	}
	return retstr;
    }

    //add another polynomial
    public void add(Polynomial p){
	Polynomial pnew=new Polynomial(add(this,p));
	this.setCoefficients(pnew.getCoefficients());
	this.setDegree(pnew.getDegree());
    }

    public void monomialmult(int deg){
	this.setDegree(this.getDegree()+deg);
	double[] coeffs = new double[this.getDegree()+1];
	double[] oldcoeffs = this.getCoefficients();
	for(int i = 0; i<oldcoeffs.length;i++){
	    coeffs[i+deg]=oldcoeffs[i];
	}
	this.setCoefficients(coeffs);
    }

    //static ring operations
    public static Polynomial add(Polynomial p1, Polynomial p2){
	Polynomial sum = new Polynomial(Math.max(p1.getDegree(),p2.getDegree()));
	for(int i = 0; i<=sum.getDegree();i++){
	    if(i<=p1.getDegree()){
		sum.setCoefficient(i,p1.getCoefficient(i));
	    }
	    if(i<=p2.getDegree()){
		sum.setCoefficient(i,sum.getCoefficient(i)+p2.getCoefficient(i));
	    }
	}
	return sum;
    }
}