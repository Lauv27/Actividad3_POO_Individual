package resuelto7;

public class ComparacionNumeros {
    double ValorA, ValorB;
    
    public ComparacionNumeros(double a, double b) {
        this.ValorA = a;
        this.ValorB = b;
    }
    
    public String determinarRelacion() {
        if (ValorA > ValorB) {
            return "A es mayor que B";
        } else if (ValorA < ValorB) {
            return "A es menor que B";
        } else {
            return "A es igual a B";
        }
    }
}
