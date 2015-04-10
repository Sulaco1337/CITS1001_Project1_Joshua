/**
 * Sequence models number sequences.
 * 
 * @author your name here
 * @version 0.0
 */
import java.util.ArrayList;
import java.lang.*;

public class Sequence
{
    private double[] sequence;
    public Sequence(String s)
    { String[] StringArray = s.split(",");
        int StringArrayLength = StringArray.length;
        sequence = new double[StringArrayLength];
        for (int i =0; i < StringArrayLength; i++){
            Double d = Double.parseDouble(StringArray[i]);
            sequence[i] = d;
        }

        // TODO
    }

    // returns sequence 
    public double[] getSequence()
    {
        return sequence;
    }

    // returns the product of 1..x 
    public int factorial(int x)
    { int result = 1; 
      for (int i = 1; i <= x; i++) {
          result = result * i; // I FEEL LIKE SOMETHING SHOULD GO HERE! SUBBING RESULT BACK INTO X????? SEEV BELOW
         
          
        }

        return 1;
    }

    // returns true iff all of the items on sequence are equal 
    public boolean allEqual()
    {
        // TODO
        return true;
    }

    // returns a new array holding the differences between adjacent items on sequence 
    public double[] differences()
    {
        // TODO
        return null;
    }

    // subtracts from each item in sequence the effect of the term t 
    // implements Step 4 of the algorithm description on the project web page 
    public void updateSequence(Term t)
    {
        // TODO
    }

    // returns the next term in the simplest polynomial that generates sequence 
    // implements Steps 1-3 of the algorithm description on the project web page 
    public Term nextTerm()
    {
        // TODO
        return new Term(0, 0);
    }

    // returns the simplest polynomial that generates sequence and displays the polynomial as a String 
    // implements the algorithm description on the project web page 
    public Polynomial solveSequence()
    {
        // TODO
        return null;
    }

}
