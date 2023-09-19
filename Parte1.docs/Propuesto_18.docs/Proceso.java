package propuesto_18;

public class SalarioEmpleado {
    double horasTrabajadas, tarifaHora, porcentajeRetencion;
    
    public SalarioEmpleado(double horasTrabajadas, double tarifaHora, double porcentajeRetencion) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }
    
    public double calcularSalarioBruto() {
        double salarioBruto = horasTrabajadas * tarifaHora;
        return salarioBruto;
    }
    
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double salarioNeto = salarioBruto - (porcentajeRetencion * salarioBruto);
        return salarioNeto;
    }
}
