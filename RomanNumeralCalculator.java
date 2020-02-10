/**
 *
 * @author Ali
 */
public class RomanNumeralCalculator 
{
    /**
     * Performs the operation between two Roman Numerals
     * @param r First Roman Numeral
     * @param n Second Roman Numeral
     * @param operation Operation that will be performed
     * @return total Result of the operation
     */
    public static String compute(RomanNumber r, RomanNumber n, String operation)
    {
        //Variable is initialized
        int result = 0 ;
        
        //Adds the two Roman Numerals
        if (operation.equals("+"))
        {
            result = r.convertToArabic() + n.convertToArabic();
        }
        
        //Subtracts the two Roman Numerals
        else if (operation.equals("-"))
        {
            result = r.convertToArabic() - n.convertToArabic();
        }
        
        //Divides the Roman Numerals
        else if (operation.equals("/"))
        {
            result = r.convertToArabic() / n.convertToArabic();
        }
        
        //Multiplies the two Roman Numerals
        else if (operation.equals("*"))
        {
            result = r.convertToArabic() * n.convertToArabic();
        }
        
        //Performs modulus operation on the two Roman Numerals
        else if (operation.equals("%"))
        {
            result = r.convertToArabic() % n.convertToArabic();
        } 
        
        //Converts the result to a RomanNumber
        RomanNumber total = new RomanNumber(result);
        
        String all =  "";
        
        //Checks for negative number
        if ( result < 0)
        {
        all = "-" + total.convertToRoman(result);
        }
        else
        {
            all = total.convertToRoman(result);
        }
        return all;
    }
}