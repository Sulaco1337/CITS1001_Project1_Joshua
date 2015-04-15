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
          result = result * i; 
          
        
        }

        return result;
    }

    // returns true iff all of the items on sequence are equal 
    public boolean allEqual()
    { for (int i =0;i < sequence.length -1;i++){
    if (sequence[i] != sequence[i+1]) return false; }

        // TODO
        return true;
    }

    // returns a new array holding the differences between adjacent items on sequence 
    public double[] differences()
    { 
    double[] seqDiff = new double[sequence.length -1]
    for (int i =0;i < sequence.length -1;i++){ 
	  seqDiff[i] = sequence[i+1] - sequence[i]
       }
        // TODO
        return seqDiff;
    }

    // subtracts from each item in sequence the effect of the term t 
    // implements Step 4 of the algorithm description on the project web page 
    public void updateSequence(Term t)
    {  for (int i =1; i <= sequence.length; i++) {
       sequence[i-1] = sequence[i-1]-(Math.pow(i,t.getExponent()) * t.getCoefficient());
        // TODO
    }

    // returns the next term in the simplest polynomial that generates sequence 
    // implements Steps 1-3 of the algorithm description on the project web page 
    public Term nextTerm()
    { int NoRuns = 0;
    double[] T = sequence;
    while(!allEqual){ sequence = differences();
    NoRuns = NoRuns + 1; 
    }
    double something = sequence[0];
    sequence = T
      
        return new Term(something/factorial(NoRuns), NoRuns);
    }

    // returns the simplest polynomial that generates sequence and displays the polynomial as a String 
    // implements the algorithm description on the project web page 
    public Polynomial solveSequence()
    {Polynomial finPoly = new Polynomial();     
while (!allEqual()){
Term j = nextTerm();
updateSequence(j);
finPoly.addTerm(j);
}

finPoly.addTerm(new term(sequence[0], int 0));
        // TODO
 System.out.println(finPoly.display());
      return finPoly;

    }

}
