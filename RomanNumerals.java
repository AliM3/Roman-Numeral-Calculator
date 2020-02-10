//File RomanNumerals.java

/**
 * An interface that can be used for each Roman Numeral
 * @author Ali Mohammad
 */
public interface RomanNumerals
{
    String getRom();
    int getNum();
}

class I implements RomanNumerals
{
    public String getRom()
    {
        return "I";
    }
    
    public int getNum()
    {
        return 1;
    }
}

class V implements RomanNumerals
{
    public String getRom()
    {
        return "V";
    }
    
    public int getNum()
    {
        return 5;
    }
}

class X implements RomanNumerals
{
    public String getRom()
    {
        return "X";
    }
    
    public int getNum()
    {
        return 10;
    }
}

class L implements RomanNumerals
{
    public String getRom()
    {
        return "L";
    }
    
    public int getNum()
    {
        return 50;
    }
}

class C implements RomanNumerals
{
    public String getRom()
    {
        return "C";
    }
    
    public int getNum()
    {
        return 100;
    }
}

class D implements RomanNumerals
{
    public String getRom()
    {
        return "D";
    }
    
    public int getNum()
    {
        return 500;
    }
}

class M implements RomanNumerals
{
    public String getRom()
    {
        return "M";
    }
    
    public int getNum()
    {
        return 1000;
    }
}