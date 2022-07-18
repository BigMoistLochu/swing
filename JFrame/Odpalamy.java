package swing.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Odpalamy
{

        public static void main(String[] args) {

        okienko okienko1  = new okienko();//tworzymy obiekt i przypisujemy go do zmiennej okienko1
        okienko1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ustawiamy ze gdy nacisniemy exit to aplikacja sie wylacza
        okienko1.setVisible(true);//to jest pokazanie wizualne czyli na naszych oczach sie odpala
    }
}
