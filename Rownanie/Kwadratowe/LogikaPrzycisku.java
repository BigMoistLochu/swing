package swing.Rownanie.Kwadratowe;

public class LogikaPrzycisku {
    Double a,b,c,Delta;

    public LogikaPrzycisku(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.Delta = (b*b)-(4*a*c);
    }

    public String Oblicz() {
        double x1 = 0;
        if (this.Delta > 0) {
            x1 = (-this.b) - (this.Delta);

        }
        return "Ape: " + x1;
    }





}
