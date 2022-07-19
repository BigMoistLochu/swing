package swing.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class okienko extends JFrame implements ActionListener {

    JButton bPodajDate,bWyjscie;
    public okienko() //konstruktor bo ogolnie mozna by bylo to zrobic w oddzielnej klasie
    {
        setSize(300,200);
        setTitle("Moje Pierwsze Okienko");

        setLayout(null);//zebysmy samemu wypelniali a nie zeby byl jakis layout nalozony

        bPodajDate = new JButton("Podaj Date");//tworzymy nowy obiekt dla przycisku
        bPodajDate.setBounds(50,50,100,20);//rozmiar naszego przycisku
        add(bPodajDate);//dodajemy go do naszego okienka
        bPodajDate.addActionListener(this);//przechwytujemy zdarzenie ktore zostalo wyslane po nacisnieciu przycisku

        bWyjscie = new JButton("Wyjscie");
        bWyjscie.setBounds(150,50,100,20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) //przeciazylismy metode ktora zostala odziedziczona po przez interfejs
    {
        Object zrodlo = e.getSource();
        if(zrodlo==bPodajDate){
            przycisk datanr1 = new przycisk();
            datanr1.data();
        }
        else if(zrodlo==bWyjscie)
        {
            dispose();
        }

    }




}
