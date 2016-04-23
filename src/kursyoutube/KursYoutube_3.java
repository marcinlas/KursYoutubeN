
package kursyoutube;

import java.util.Scanner;

public class KursYoutube_3 
{
    public static void main (String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Napisz coś: ");
        String str = s.nextLine();
        System.out.println("W konsoli napisano: " + str);
        
     
        System.out.println("Napisz ile masz lat: ");
    //    int wiek = s.nextInt();
    //    System.out.println("Masz " + wiek + " lat." );
        
        



    // sprawdza czy wykona się warunek, tutaj czy podano liczbę całkowitą !!!     
        
    try   
        {    
            int wiek1 = s.nextInt();
            System.out.println("Masz " + wiek1+ " lat!");
        }
    catch(Exception e)    // jeśli nie będzie podana liczba całkowita wyświetli się tekst 
        {         
            System.out.println("Podano złą wartość! Wymagana liczba całkowita"); 
        }                     
    }  
}