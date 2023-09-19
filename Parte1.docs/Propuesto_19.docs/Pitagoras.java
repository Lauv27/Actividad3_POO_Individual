package propuesto19;

public class Pitagoras {
    double longitud;
    
    public Pitagoras(double longitud) {
        this.longitud = longitud;
    }
    
    public double calcularUltimoLado() {
        double medioLado = longitud / 2;
        double lado = Math.sqrt(Math.pow(longitud, 2) - Math.pow(medioLado, 2));
        return lado;
    }
}
