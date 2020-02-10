import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * A test class for the Roman Numeral Calculator class
 * @author Ali Mohammad
 */
public class Test 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(new File("Roman.txt"));

        try (PrintWriter output = new PrintWriter(new File("./src/output.txt")))
        {
            while (input.hasNext())
            {
                //Creates the first Roman Numeral
                String r = input.next();
                
                RomanNumber roman = new RomanNumber(r);
                
                //Finds the operation
                String operation = input.next();
                
                //Creates the second Roman Numeral
                String n = input.next();
                
                RomanNumber number = new RomanNumber(n);
                
                //Prints the output
                String total = 
                        RomanNumeralCalculator.compute(roman,number,operation);
                
                RomanNumber result = new RomanNumber(total);
                
                System.out.print(roman.convertToRoman(roman.convertToArabic()));
                
                System.out.print(" " + operation + " ");
                
                System.out.print(
                        number.convertToRoman(number.convertToArabic()));
                
                System.out.print(" = ");
                
                //Checks if number is greater than 3999
                if(result.convertToArabic() > 3999)
                {
                    System.out.println("Overflow");
                }
                else
                {
                    System.out.println(total);
                }
                
                System.out.print(roman.convertToArabic() + " " + operation);
                
                System.out.print(" " + number.convertToArabic());              
                
                //Checks for negative number
                if(total.contains("-"))
                {
                    System.out.println(" = -" + result.convertToArabic());
                }
                else
                {
                    System.out.println(" = " + result.convertToArabic());
                }
            }
        }
    }
}
