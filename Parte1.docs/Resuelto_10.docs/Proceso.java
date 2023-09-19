package resuelto10;

public class CalculoPagoMatricula {
    double patrimonio, estrato, matricula = 50000;
    
    public CalculoPagoMatricula(double patrimonio, double estrato) {
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }
    
    public double calcularPagoMatricula() {
        if (patrimonio > 2000000 && estrato > 3) {
            matricula = matricula + (0.03 * patrimonio);
        }
        return matricula;
    }
}
