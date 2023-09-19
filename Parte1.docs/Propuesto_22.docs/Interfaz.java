package propuesto22;

public class InterfazVentana extends javax.swing.JFrame {
    public InterfazVentana() {
        initComponents();
        txtRespuesta.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        String nombre = String.valueOf(txtNombre.getText());
        double horasTrabajadas = Double.parseDouble(txtHorasMes.getText());
        double valorHora = Double.parseDouble(txtValorHora.getText());
        CalculoSalario salario = new CalculoSalario(horasTrabajadas, valorHora, nombre);
        String respuesta = salario.calcularSalario();
        txtRespuesta.setText(respuesta);
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtHorasMes.setText("");
        txtValorHora.setText("");
        txtRespuesta.setText("");
        txtNombre.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazVentana().setVisible(true);
            }
        });
    }
}
