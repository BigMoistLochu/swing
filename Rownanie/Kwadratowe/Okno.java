package swing.Rownanie.Kwadratowe;

import swing.JFrame.przycisk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame implements ActionListener {

    JLabel A,B,C,Podaj;
    JTextField tA,tB,tC;
    JButton bOblicz;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) //przeciazylismy metode ktora zostala odziedziczona po przez interfejs
    {

    }


}
