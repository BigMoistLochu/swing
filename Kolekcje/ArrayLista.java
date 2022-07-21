package swing.Kolekcje;
import java.lang.reflect.Array;
import java.util.*;
public class ArrayLista {

    public static void main(String[] args) {
        //zad1
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        
        Random rand = new Random();
        //dodawanie liczb randomowych do arraylisty
        for(int c=0;c<6;c++)
        {
            int n = rand.nextInt(50);
            liczby.add(n);
            System.out.println("To jest pozycja: "+c+" i wynosi: "+liczby.get(c));
        }
        //sorting of arraylist "liczby"
        Collections.sort(liczby);

        //wyswietlanie arraylisty
        for(int c=0;c<6;c++)
        {
            System.out.println("To jest pozycja: "+c+" i wynosi: "+liczby.get(c));
        }

        //zad2
        ArrayList imiona = new ArrayList();

        imiona.add("Tomek");
        imiona.add("Zyzz");
        imiona.add("Sylwia");
        imiona.add("Dawid");
        imiona.add("Benek");
        imiona.add("Ada");

        Collections.sort(imiona);

        for (Object x: imiona) {
            System.out.println(x);
        }

        int[] tablica = new int[2];

        tablica[0] = 3;
        tablica[1] = 2;


        for(int k:tablica)
        {
            System.out.println(k);
        }


    }


}
