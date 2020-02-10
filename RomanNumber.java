import java.util.ArrayList;

/**
 * A class that converts Roman Numerals to Arabic Numerals and Arabic Numerals
 * to Roman Numerals.
 * @author Ali
 */
public class RomanNumber 
{
    //Creates an empty list to hold the Roman Numeral letters
    ArrayList<RomanNumerals> rn = new ArrayList<>();
       
    /**
     * Adds the letters to the list
     * @param roman The Roman Numeral that is added to the list
     */
    public RomanNumber(String roman)
    {        
        addRomanNumerals(roman);   
    }
    
    /**
     * Converts the Arabic Numerals to Roman Numerals and adds them to the list
     * @param numeral The Arabic Numeral that is converted to Roman Numeral
     */
    public RomanNumber(int numeral)
    {
        addRomanNumerals(convertToRoman(numeral));
    }

    /**
     * Converts the Roman Numeral to Arabic
     * @return arabicNumber The Arabic Numeral that was converted from Roman
     */
    public int convertToArabic()
    {
        //Varaible is initialized
        int arabicNumber = 0;
        
        //Compares each letter in the list to the one next to it
        for (int i = 1 ; i < rn.size() ; i++)
        {
            //Adds number if the letter is greater than the next
            if(rn.get(i - 1).getNum() >= rn.get(i).getNum())
            {
                arabicNumber += rn.get(i - 1).getNum();
            }
            
            //Checks if the letter is a lower value
            else if (rn.get(i - 1).getNum() < rn.get(i).getNum())
            {
                //Check if it is the last letter and adds it
                if( i == rn.size() - 1)
                {
                    arabicNumber += rn.get(i).getNum();
                }
                
                //Checks if the letter can be subtracted
                if (rn.get(i - 1).getNum() == 1 || 
                    rn.get(i - 1).getNum() == 10 || 
                    rn.get(i - 1).getNum() == 100 && 
                    rn.get(i - 1).getNum() >= rn.get(i).getNum()/10)
                {
                    arabicNumber -= rn.get(i - 1).getNum();
                }
                
                //Letter cannot be subtracted so it is added
                else
                {
                    arabicNumber += rn.get(i - 1).getNum();
                }
            }
            
            //Adds the last letter that if it was not already
            if (rn.get(i - 1).getNum() >= rn.get(i).getNum() && 
                i == rn.size() - 1)
            {
                arabicNumber += rn.get(i).getNum();
            }
        }

        //Adds the letter to the list if it is the only one
        if (rn.size() == 1)
        {
            arabicNumber = rn.get(0).getNum();
        }        
        return arabicNumber;
    }
    
    /**
     * Converts Arabic to Roman
     * @param n The number that will be converted
     * @return The Roman Numeral converted from the parameter n
     */
    public String convertToRoman(int n)
    {
        //Varaible is initialized
        String r = "";

        //When the Arabic number is positive
        while (n > 0)
        {
            //Adds M for every 1000 subtracted
            if (n - 1000 >= 0)
            {
                r += "M";
                n -= 1000;
            }
            
            //Adds CM for every 900 subtracted
            else if (n - 900 >= 0)
            {
                r += "CM";
                n -= 900;
            }
            
            //Adds D for every 500 subtracted
            else if (n - 500 >= 0)
            {
                r += "D";
                n -= 500;
            }
            
            //Adds CD for every 400 subtracted
            else if (n - 400 >= 0)
            {
                r += "CD";
                n -= 400;
            }
            
            //Adds C for every 100 subtracted
            else if (n - 100 >= 0)
            {
                r += "C";
                n -= 100;
            }
            
            //Adds XC for every 90 subtracted
            else if (n - 90 >= 0)
            {
                r += "XC";
                n -= 90;
            }
            
            //Adds L for every 50 subtracted
            else if (n - 50 >= 0)
            {
                r += "L";
                n -= 50;
            }
            
            //Adds XL for every 40 subtracted
            else if (n - 40 >= 0)
            {
                r += "XL";
                n -= 40;
            }
            
            //Adds X for every 10 subtracted
            else if (n - 10 >= 0)
            {
                r += "X";
                n -= 10;
            }
            
            //Adds IX for every 9 subtracted
            else if (n - 9 >= 0)
            {
                r += "IX";
                n -= 9;
            }
            
            //Adds V for every 5 subtracted
            else if (n - 5 >= 0)
            {
                r += "V";
                n -= 5;
            }
            
            //Adds IV for every 4 subtracted
            else if (n - 4 >= 0)
            {
                r += "IV";
                n -= 4;
            }
            
            //Adds I for every 1 subtracted
            else
            {
                r += "I";
                n -= 1;
            }
        }
        
        //When the Arabic Number is negative
        while (n < 0)
        {
            //Adds the letter M for every 1000 added
            if (n + 1000 <= 0)
            {
                r += "M";
                n += 1000;
            }
            
            //Adds the letter CM for every 900 added
            else if (n + 900 <= 0)
            {
                r += "CM";
                n += 900;
            }
            
            //Adds the letter D for every 500 added
            else if (n + 500 <= 0)
            {
                r += "D";
                n += 500;
            }
            
            //Adds the letter CD for every 400 added
            else if (n + 400 <= 0)
            {
                r += "CD";
                n += 400;
            }
            
            //Adds the letter C for every 100 added
            else if (n + 100 <= 0)
            {
                r += "C";
                n += 100;
            }
            
            //Adds the letter XC for every 90 added
            else if (n + 90 <= 0)
            {
                r += "XC";
                n += 90;
            }
            
            //Adds the letter L for every 50 added
            else if (n + 50 <= 0)
            {
                r += "L";
                n += 50;
            }
            
            //Adds the letter XL for every 40 added
            else if (n + 40 <= 0)
            {
                r += "XL";
                n += 40;
            }
            
            //Adds the letter X for every 10 added
            else if (n + 10 <= 0)
            {
                r += "X";
                n += 10;
            }
            
            //Adds the letter IX for every 9 added
            else if (n + 9 <= 0)
            {
                r += "IX";
                n += 9;
            }
            
            //Adds the letter V for every 5 added
            else if (n + 5 <= 0)
            {
                r += "V";
                n += 5;
            }
            
            //Adds the letter IV for every 4 added
            else if (n + 4 <= 0)
            {
                r += "IV";
                n += 4;
            }
            
            //Adds the letter I for every 1 added
            else
            {
                r += "I";
                n += 1;
            }
        }
        
        //Returns the Roman Numeral as a string
        return r;
    }
    
    /**
     * Converts the list into a string
     * @return r Modified string for the list
     */
    public String toString()
    {
        String r = "";
        for (int i = 0 ; i < rn.size() ; i++)
        {
            r += rn.get(i).getRom();
        }
        r += "\n" ;
        for (int j = 0 ; j < rn.size() ; j++)
        {
            r+= rn.get(j).getRom() + "+" ;
        }
        return r;
    }

    //Adds each letter to the list
    private void addRomanNumerals(String toBeConverted)
    {
        toBeConverted.toUpperCase();
        
        for (int i = 0 ; i < toBeConverted.length() ; i++)
        {
            if(toBeConverted.charAt(i)== 'I')
            {
                rn.add(new I());
            }
            else if (toBeConverted.charAt(i)== 'V')
            {
                rn.add(new V());
            }
            else if (toBeConverted.charAt(i)== 'X')
            {
                rn.add(new X());
            }
            else if (toBeConverted.charAt(i)== 'L')
            {
                rn.add(new L());
            }
            else if (toBeConverted.charAt(i)== 'C')
            {
                rn.add(new C());
            }            
            else if (toBeConverted.charAt(i)== 'D')
            {
                rn.add(new D());
            }
            else if (toBeConverted.charAt(i)== 'M')
            {
                rn.add(new M());
            }                     
        }
    } 
}