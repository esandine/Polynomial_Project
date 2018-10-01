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
}