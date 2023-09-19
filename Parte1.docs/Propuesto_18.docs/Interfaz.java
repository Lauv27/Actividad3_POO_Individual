package propuesto_18;

public class InterfazUsuario extends javax.swing.JFrame {
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double horasTrabajadas, retencionFuente, tarifaHora, salarioNeto, salarioBruto;
        String codigoEmpleado, nombre;
        codigoEmpleado = String.valueOf(txtCodigoEmpleado.getText());
        nombre = String.valueOf(txtNombre.getText());
        horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        tarifaHora = Double.parseDouble(txtTarifaHora.getText());
        retencionFuente = Double.parseDouble(txtRetencionFuente.getText());
        SalarioEmpleado salarioEmpleado = new SalarioEmpleado(horasTrabajadas, tarifaHora, retencionFuente);
        double salarioBrutoCalculado = salarioEmpleado.calcularSalarioBruto();
        double salarioNetoCalculado = salarioEmpleado.calcularSalarioNeto();
        txtCodigo.setText(String.valueOf(codigoEmpleado));
        txtNombreDos.setText(nombre);
        txtSalarioBruto.setText(String.valueOf(salarioBrutoCalculado));
        txtSalarioNeto.setText(String.valueOf(salarioNetoCalculado));
    }

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtCodigoEmpleado.setText("");
        txtHorasTrabajadas.setText("");
        txtTarifaHora.setText("");
        txtRetencionFuente.setText("");
        txtRetencionFuente.setText("");
        txtCodigo.setText("");
        txtSalarioNeto.setText("");
        txtSalarioBruto.setText("");
        txtNombre.setText("");
        txtNombreDos.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    public InterfazUsuario() {
        initComponents();
        txtCodigo.setEditable(false); // Campos no editables
        txtNombreDos.setEditable(false);
        txtSalarioBruto.setEditable(false);
        txtSalarioNeto.setEditable(false);
    }
}
