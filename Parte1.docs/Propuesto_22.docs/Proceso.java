package propuesto22;

public class CalculoSalario {
    double horasTrabajadas, valorHora, salario;
    String nombre;

    public CalculoSalario(double horas, double valor, String nombre) {
        this.horasTrabajadas = horas;
        this.valorHora = valor;
        this.nombre = nombre;
    }

    public String calcularSalario() {
        String salto = System.getProperty("line.separator");
        salario = horasTrabajadas * valorHora;
        if (salario < 450000) {
            return nombre;
        } else {
            return nombre + salto + String.valueOf(salario);
        }
    }
}

