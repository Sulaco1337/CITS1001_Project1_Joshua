/**
 * Term models terms in a polynomial. 
 * 
 * @author your name here
 * @version 0.0
 */
public class Term
{
    // the term = coefficient * x ^ exponent
    private double coefficient;
    private int    exponent;

    public Term(double c, int e)
    {
        coefficient = c;
        exponent = e;
    }
    
    // returns the coefficient
    public double getCoefficient()
    {
        return coefficient;
    }
    
    // returns the exponent
    public int getExponent()
    {
        return exponent;
    }

    // returns the term as a String for display 
    // see the sample file for the layout required 
    public String display()
    {
       // TODO
       return "";
    }
}
