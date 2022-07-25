package swing.Hospital;

import swing.Database.Widok;

import javax.swing.*;

public class Start {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ustawiamy ze gdy nacisniemy exit to aplikacja sie wylacza
        mainView.setVisible(true);//to jest pokazanie wizualne czyli na naszych oczach sie odpala
    }
}
