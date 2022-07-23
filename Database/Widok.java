package swing.Database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Widok extends JFrame {

    JLabel lglowne,lnazwa,lcena,lkategoria,lid;
    JTextField tnazwa,tcena,tkategoria,tid;
    JButton bzaktualizuj,busun,bdodaj,bszukaj;
    public Widok()
    {
        //okienko
        setSize(600,600);
        setTitle("Program Laczenia Sie Z Baza Danych");
        setLayout(null);
        //nazwa glowna
        lglowne = new JLabel("PROGRAM LACZENIA SIE Z BAZA DANYCH ");
        lglowne.setBounds(150,0,300,50);
        add(lglowne);

        //nazwa produktu
        lnazwa = new JLabel("Nazwa Produktu:  ");
        lnazwa.setBounds(50,50,150,20);
        add(lnazwa);
        //pole tekstowe produktu
        tnazwa = new JTextField();
        tnazwa.setBounds(160,50,300,20);
        add(tnazwa);

        //cena
        lcena = new JLabel("Cena Produktu:  ");
        lcena.setBounds(50,100,150,20);
        add(lcena);
        //pole tekstowe ceny
        tcena = new JTextField();
        tcena.setBounds(160,100,300,20);
        add(tcena);

        //kategoria
        lkategoria = new JLabel("Kategoria Produktu:");
        lkategoria.setBounds(50,150,150,20);
        add(lkategoria);
        //pole tekstowe kategorii
        tkategoria = new JTextField();
        tkategoria.setBounds(165,150,300,20);
        add(tkategoria);

        //id produktu
        lid = new JLabel("ID Produktu:");
        lid.setBounds(50,200,150,20);
        add(lid);
        //pole tekstowe id
        tid = new JTextField();
        tid.setBounds(160,200,300,20);
        add(tid);

        //przycisk Dodaj
        bdodaj = new JButton("Dodaj");
        bdodaj.setBounds(50,250,100,20);
        add(bdodaj);
        //action lisiner dla przycisku Dodaj
        bdodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name,price,category;

                try {
                    name = tnazwa.getText();
                    price = tcena.getText();
                    category = tkategoria.getText();

                    //tworzymy obiekt
                    DataBase polaczenie = new DataBase();
                    //metoda ktora sie laczy z baza danych
                    polaczenie.Connect();
                    //metoda ktora dodaje do bazy
                    polaczenie.Add(name, price, category);
                    JOptionPane.showMessageDialog(null, "Record Addedddddd!!!!");
                    tnazwa.setText("");
                    tcena.setText("");
                    tkategoria.setText("");
                    tnazwa.requestFocus();
                }
                catch (NullPointerException ex)
                {
                    System.out.println("Jakies braki w polach!");
                }

            }
        });

        //przycisk Usun
        busun = new JButton("Usun");
        busun.setBounds(50,300,100,20);
        add(busun);
        //action lisiner dla przycisku Usun

        //przycisk Zaktualizuj
        bzaktualizuj = new JButton("Zaktualizuj");
        bzaktualizuj.setBounds(50,350,100,20);
        add(bzaktualizuj);
        //action lisiner dla przycisku Zaktualizuj

        //przycisk szukaj
        bszukaj = new JButton("SZUKAJ");
        bszukaj.setBounds(190,250,100,20);
        add(bszukaj);
        //action lisiner dla przycisku szukaj
        bszukaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pid = tid.getText();

                //tworzymy obiekt
                DataBase polaczenie = new DataBase();
                //metoda ktora sie laczy z baza danych
                polaczenie.Connect();
                //metoda ktora szuka z bazy danych
                //polaczenie.Search(pid);//to bedzie tablica wiec
                JOptionPane.showMessageDialog(null, "Record Addedddddd!!!!");
                tnazwa.setText(polaczenie.Search(pid)[0]);
                tcena.setText(polaczenie.Search(pid)[1]);
                tkategoria.setText(polaczenie.Search(pid)[2]);
                tnazwa.requestFocus();
            }
        });



    }




}
