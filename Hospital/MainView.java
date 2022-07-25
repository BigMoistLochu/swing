package swing.Hospital;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JLabel lglowne;
    private JButton bzaloguj,bregister;
    public PanelHasla panelHasla;

    public MainView()//konstruktor ktory jesy inicjalizowany od razy kiedy powstaje obiekt
    {
        //ustawiamy okno glowne
        setSize(600,300);
        setTitle("Strona Glowna");
        setLayout(null);//bez zadnych layoutow

        //Napis glowny
        lglowne = new JLabel("Witamy na stronie logowania!");
        lglowne.setBounds(180,0,200,50);
        add(lglowne);

        //przycisk zaloguj
        bzaloguj = new JButton("Zaloguj");
        bzaloguj.setBounds(100,100,100,20);
        add(bzaloguj);
        bzaloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelHasla = new PanelHasla();
                panelHasla.setVisible(true);
            }
        });

        //przycisk zarejestruj
        bregister = new JButton("Zarejestruj");
        bregister.setBounds(350,100,100,20);
        add(bregister);


    }
}
