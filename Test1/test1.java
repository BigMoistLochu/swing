package swing.Test1;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {

        ArrayList<Object> test = new ArrayList();

        test.add("Pss");
        test.add(4);
        test.add("5");
        test.add("A");

        for(Object x:test)
        {
            System.out.println(x);
        }

    }
}
