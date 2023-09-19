package propuesto23;

public class CalculoEcuacion {
    double valorA, valorB, valorC;
    String resultado;

    public CalculoEcuacion(double a, double b, double c) {
        this.valorA = a;
        this.valorB = b;
        this.valorC = c;
    }

    public String calcularSoluciones() {
        double discriminante = calcularDiscriminante();
        if (discriminante > 0) {
            double x1 = (-valorB + Math.sqrt(discriminante)) / (2 * valorA);
            double x2 = (-valorB - Math.sqrt(discriminante)) / (2 * valorA);
            return "Las soluciones son: " + x1 + " y " + x2;
        } else if (discriminante == 0) {
            double x = -valorB / (2 * valorA);
            return "La solución es: " + x;
        } else {
            return "No tiene soluciones reales";
        }
    }

    private double calcularDiscriminante() {
        return (valorB * valorB) - (4 * valorA * valorC);
    }
}
