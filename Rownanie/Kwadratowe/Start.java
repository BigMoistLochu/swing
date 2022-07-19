package swing.Rownanie.Kwadratowe;

import javax.swing.*;

public class Start {

    public static void main(String[] args) {
        Okno rownanie1 = new Okno();
        rownanie1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ustawiamy ze gdy nacisniemy exit to aplikacja sie wylacza
        rownanie1.setVisible(true);//to jest pokazanie wizualne czyli na naszych oczach sie odpala
    }
}
