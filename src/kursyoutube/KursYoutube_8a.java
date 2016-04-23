package kursyoutube;


public class KursYoutube_8a 
{
    int liczba = 123;
    
    KursYoutube_8a()
    {
        System.out.println("Stworzono nowy obiekt klasy KursYoutube_8a");
    }
    KursYoutube_8a(int liczba)
    {
        System.out.println("Stworzono nowy obiekt klasy KursYoutube_8a");
        System.out.println("Podano liczbę" + liczba);
    }
    KursYoutube_8a(String str) 
    {
        System.out.println("Stworzono nowy obiekt klasy KursYoutube_8a");
        System.out.println("Podano string" + str);
    }
    
    public int mnozenie(int liczba)
    {
        this.liczba = liczba;
        return liczba;
    }
    public void wypisz()
    {
        wypisz2();
    }
    private void wypisz2()
    {
        System.out.println(liczba);
    }
    
}
    