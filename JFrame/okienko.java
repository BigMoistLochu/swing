package swing.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class okienko extends JFrame implements ActionListener {

    public okienko() //konstruktor bo ogolnie mozna by bylo to zrobic w oddzielnej klasie
    {
        setSize(300,200);
        setTitle("Moje Pierwsze Okienko");

        setLayout(null);//zebysmy samemu wypelniali a nie zeby byl jakis layout nalozony




        JButton bPodajDate = new JButton("Podaj Date");//tworzymy nowy obiekt dla przycisku
        bPodajDate.setBounds(100,50,100,20);//rozmiar naszego przycisku
        add(bPodajDate);//dodajemy go do naszego okienka
        bPodajDate.addActionListener(this);//przechwytujemy zdarzenie ktore zostalo wyslane po nacisnieciu przycisku
    }


    @Override
    public void actionPerformed(ActionEvent e) //przeciazylismy metode ktora zostala odziedziczona po przez interfejs
    {
        System.out.println(new Date());//
    }


}
