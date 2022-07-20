package swing.Rownanie.Kwadratowe;

import swing.JFrame.przycisk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame implements ActionListener {

    JLabel A,B,C,Podaj,Wynik;
    double a,b,c;
    JTextField tA,tB,tC,tWynik;
    JButton bOblicz,bWyjscie;
    public Okno()
    {
        //rozmiar okna glownego
        setSize(400,400);
        setTitle("Oblicz Pierwiastek!");
        setLayout(null);
        Podaj = new JLabel("Podaj: ");
        Podaj.setBounds(0,50,100,20);
        add(Podaj);
        //wspolczynnik A i jego tekst
        A = new JLabel("a");
        A.setBounds(100,50,50,20);
        add(A);

        tA = new JTextField();
        tA.setBounds(110,50,30,20);
        add(tA);
        //wspolczynnik B i jego tekst
        B = new JLabel("b");
        B.setBounds(150,50,50,20);
        add(B);

        tB = new JTextField();
        tB.setBounds(160,50,30,20);
        add(tB);
        //wspolczynnik C i jego tekst
        C = new JLabel("c");
        C.setBounds(200,50,50,20);
        add(C);

        tC = new JTextField();
        tC.setBounds(210,50,30,20);
        add(tC);

        //przycisk

        bOblicz = new JButton("Oblicz");
        bOblicz.setBounds(120,100,100,20);
        add(bOblicz);
        bOblicz.addActionListener(this);
        //wyjscie
        bWyjscie = new JButton("Wyjscie");
        bWyjscie.setBounds(230,100,100,20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);

        //wynik

        Wynik = new JLabel("Wynik: ");
        Wynik.setBounds(120,150,50,20);
        add(Wynik);

        tWynik = new JTextField();
        tWynik.setBounds(180,150,400,20);
        add(tWynik);
    }

    @Override
    public void actionPerformed(ActionEvent e) //przeciazylismy metode ktora zostala odziedziczona po przez interfejs
    {
        Object zrodlo = e.getSource();
        try
        {
            if(zrodlo==bOblicz)
            {
                a = Double.parseDouble(tA.getText());
                b = Double.parseDouble(tB.getText());
                c = Double.parseDouble(tC.getText());
                LogikaPrzycisku test1 = new LogikaPrzycisku(a,b,c);
                tWynik.setText(test1.Oblicz());
            }
            else
            {
                dispose();
            }
        }
        catch(NumberFormatException ex)
        {
            tWynik.setText("nie podano liczby!");
        }


    }


}
