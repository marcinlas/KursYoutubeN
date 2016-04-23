
// APLIKACJA KALKULATOR :)  

package kursyoutube;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KursYoutube_5 
{
    // METODA STATYCZNA --> czyli, że tworzy się samoistnie na początku programu !!!
    static JTextField tf;  // WARTOŚĆ MUSI BYĆ STATYCZNA DLATEGO, ŻE FUNKCJA, CZYLI METODA JEST STATYCZNA !!!
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Kalkulator");  // tworzenie okienka
        frame.setSize(250, 350);    // szerokość i wysokość okienka w pixelach
        frame.setLocation(300,300);  // pojawienie się 300pix od góry i dołu
        frame.setResizable(false); // nie rozszerzanie się okna
        frame.setLayout(null);  // sami ustawimy w którym miejscu co ma być
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // uwalnianie aplikacji z pamięci
        
        tf = new JTextField("");  // tworzenie miejsca działań
        tf.setBounds(10, 10, 230, 50); // ustawienie w odpowiednim miejscu
        Font f = new Font("New Times Roman",Font.BOLD,24); //tworzenie czcionki, typ, pogrubienie, rozmiar
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.RIGHT); //wpisywanie od prawej strony
        frame.add(tf); // dodanie do frame i nazwa textfield'u
        
        JButton button = new JButton("Oblicz"); // dodanie przycisku o nazwie JButton
        button.setBounds(10, 70, 40, 40);
        button.setBorder(null);  // na przycisku pojawia się liczba " 1 "
        frame.add(button);  // dodawanie przycisku
        
        button.addActionListener(new ActionListener()  // wykonanie akcji 
        {
            public void actionPerformed(ActionEvent arg0) // dajemy nasłuchiwać akcji dla przycisku
            {                                            //  gdy naciśniemy - wykona się to co jest w nawiasie
                String str = tf.getText();
                
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                String foo = str;
                  // 
                try
                {
                    tf.setText(String.valueOf(engine.eval(foo)));
                }
                catch (ScriptException e)
                {
                    JFrame frame2 = new JFrame("Błąd!"); // wyjątek gdy ktoś wpiszę tekst zamiast liter !!!
                    frame2.setSize(250, 130);  // rozmiar okienka wyjątku
                    frame2.setLocation(300, 300);  // ulokowanie okienka wyjątku
                    Font f2 = new Font("Comic Sans",Font.CENTER_BASELINE,40); // czcionka, centrowanie tekestu i rozmiar
                    JLabel label = new JLabel(" Podano złą wartość!"); // wyświetlenie tekstu
                    frame2.add(label);  // 
                    frame2.setVisible(true);  // ustawienie widoczności
                    
                }
                
                
                //  tf.setText(tf.getText() + "1");  // dodanie do TextField'u liczbę 1, czyli nowej wartości, która jest w nawiasie
            }
        });
        
        frame.setVisible(true); // wyświetlanie okienka programu
        
    }
    
}
