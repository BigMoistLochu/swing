package swing.Rownanie.Kwadratowe;

import static java.lang.Math.sqrt;

public class LogikaPrzycisku {
    Double a,b,c,Delta,x1,x2;
    String rozwiazanie;

    public LogikaPrzycisku(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.Delta = (b*b)-(4*a*c);
    }

    public String Oblicz() {

        if(this.Delta > 0) {
            x1 = ((-this.b) - sqrt(this.Delta))/(2*this.a);
            x2 = ((-this.b) + sqrt(this.Delta))/(2*this.a);
            rozwiazanie = "Rozwiazanie to 2 pierwiastki x1: " + x1 + " x2: " + x2;
        }
        else if(this.Delta==0)
        {
            x1=-this.b/2*this.a;
            rozwiazanie = "Rozwiazanie to 1 pierwiastki x1: " + x1;
        }
        else
        {
            rozwiazanie = "Nie ma rozwiazania";
        }
        return rozwiazanie;
    }





}
