package resuelto7;

public class InterfazVentana extends javax.swing.JFrame {
    public InterfazVentana() {
        initComponents();
        txtResultado.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double ValorA, ValorB;
        ValorA = Double.parseDouble(txtValorA.getText());
        ValorB = Double.parseDouble(txtValorB.getText());
        ComparacionNumeros comparacion = new ComparacionNumeros(ValorA, ValorB);
        String resultado = comparacion.determinarRelacion();
        txtResultado.setText(resultado);
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtValorA.setText("");
        txtValorB.setText("");
        txtResultado.setText("");
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
