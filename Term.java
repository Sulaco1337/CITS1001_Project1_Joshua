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
    { String result = "";
    if(coefficient==0){
    return "+ 0";}
    else if(coefficient%1==0){
    //is int
     if(coefficient == 1 && exponent != 0){
   result = result + "+ ";}
   else if(coefficient == -1 && exponent != 0){
   result = result + "- ";}
   else if(coefficient == 1 && exponent != 1){
   result = result + "+ x";}
   else if(coefficient == -1 && exponent != 1){
   result = result + "- x";}
   //For a good time, call 0400455687
    else if (coefficient < 0){ result = result + "- " + (String.valueOf((int) -1 *  coefficient));}
   else result = result + "+ " + String.valueOf((int) coefficient);
    }
    else{
    //is double
    if (coefficient < 0){ result = result + "- " + (String.valueOf(-1 *  coefficient));}
   else result = result + "+ " + String.valueOf(coefficient);
    }
   
if (exponent == 1){ result = result + "x";}
   else if (exponent == 0){} 
   else {result	= result + "x^" + String.valueOf(exponent); 
   }
       return result;
    }
}