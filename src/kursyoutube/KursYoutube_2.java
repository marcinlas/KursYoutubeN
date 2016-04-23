
package kursyoutube;

public class KursYoutube_2 
{
    private static boolean j;
    public static void main (String[] args) 
    {
        byte b = 18; // 1 bajt pamięci, czyli 8 bitów !!!
        b = 23;
        short s = 123; // 16 bitów
        int i = 123;  // 32 bity
        long l = 12345;  //64 bity
        
        System.out.println("Zmienna b typu byte wynosi: " + b);  
        System.out.println("Zmienna i razy 5: " + (i*5));
        
        double  d = 123.512;  // 64 bity
        System.out.println(d);
        
        float f = (float) 123.1024;
        System.out.println("Zmienna float wynosi: " + f);
        
        char ch = 'S';// zmienna w której mozemy przechowywać pojedyńcze znaki
        char ch1 = 'a', ch2 = 'b'; char ch3 = 'c';
        
        String h = "Wpisywanie całych zdań";
        System.out.println(h);
        
        String str1 = "abc";
        String str2 = "drf";
        String jk = str1+str2;
        System.out.println(jk);
        
        boolean bool = true;
        System.out.println(bool);
    }
}
