package swing.Kolekcje;
import java.util.*;
public class ArrayLista {

    public static void main(String[] args) {
        ArrayList liczby = new ArrayList();
        Random rand = new Random();



        for(int c=0;c<6;c++)
        {
            int n = rand.nextInt(50);
            liczby.add(n);
            System.out.println("To jest pozycja: "+c+" i wynosi: "+liczby.get(c));
        }

        Collections.sort(liczby);

        for(int c=0;c<6;c++)
        {
            System.out.println("To jest pozycja: "+c+" i wynosi: "+liczby.get(c));
        }
    }


}
