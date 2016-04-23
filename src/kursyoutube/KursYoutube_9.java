
package kursyoutube;

import java.math.BigInteger;

public class KursYoutube_9 
{
    public static void main(String[] args)
    {
        for (int i=1; i<=1000;i++)
        {
            System.out.println("Silnia z liczby " + i + " wynosi: " + silnia(BigInteger.valueOf(1)));
        }
    }
    public static BigInteger silnia(BigInteger liczba)
    {
        if (liczba.compareTo(BigInteger.valueOf(1))==1)
        {
            liczba = liczba.multiply(silnia(liczba.subtract(BigInteger.valueOf(1))));
        }
        return liczba;
    }
}