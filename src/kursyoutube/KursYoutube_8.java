
package kursyoutube;

public class KursYoutube_8 
{
    static int zmiennag = 5;
    final int a = 32;   // zmienna finalna --> nie można jej nigdy zmienić !!!
    public static void main(String [] args) 
    {
        KursYoutube_8a obiekt4 = new KursYoutube_8a();
        obiekt4.mnozenie(1000);
        obiekt4.wypisz();
        
        KursYoutube_8a obiekt1 = new KursYoutube_8a();
        KursYoutube_8a obiekt2 = new KursYoutube_8a(56);
        KursYoutube_8a obiekt3 = new KursYoutube_8a("Przykładowy tekst");        
        
        System.out.println(obiekt1.mnozenie(15));
        
        witaj();
        System.out.println("Zmienna globalna jest równa: " + zmiennag);
        zmiennag += 5;
     }

    public static void witaj() 
    {
        int zmienna = 1;
        System.out.println("Jesteśmy w metodzie witaj");
        System.out.println("Zmienna wynosi " + zmienna);
        zmienna++;
        System.out.println("Zmiennag wynosi: " + zmiennag);
    }
            
}