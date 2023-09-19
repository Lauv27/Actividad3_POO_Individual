package resuelto10;

public class InterfazVentana extends javax.swing.JFrame {
    public InterfazVentana() {
        initComponents();
        txtNumeroInscripcion2.setEditable(false);
        txtNombres2.setEditable(false);
        txtPagoMatricula.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        String numeroInscripcion = String.valueOf(txtNumeroInscripcion1.getText());
        String nombres = String.valueOf(txtNombres.getText());
        double patrimonio = Double.parseDouble(txtPatrimonio.getText());
        double estrato = Double.parseDouble(txtEstrato.getText());
        CalculoPagoMatricula matricula = new CalculoPagoMatricula(patrimonio, estrato);
        double pagoMatricula = matricula.calcularPagoMatricula();
        txtNumeroInscripcion2.setText(numeroInscripcion);
        txtNombres2.setText(nombres);
        txtPagoMatricula.setText(String.valueOf(pagoMatricula));
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtNumeroInscripcion1.setText("");
        txtNombres.setText("");
        txtPatrimonio.setText("");
        txtEstrato.setText("");
        txtNumeroInscripcion2.setText("");
        txtNombres2.setText("");
        txtPagoMatricula.setText("");
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
