package swing.Database;

import javax.swing.*;
import java.sql.*;
public class ProjektCrud {



    public static void main(String[] args) {
        //DataBase polaczenie = new DataBase();
        //polaczenie.Connect();//aktualnie to nam nie potrzebne XD

        Widok widok = new Widok();
        widok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ustawiamy ze gdy nacisniemy exit to aplikacja sie wylacza
        widok.setVisible(true);//to jest pokazanie wizualne czyli na naszych oczach sie odpala

    }





}
