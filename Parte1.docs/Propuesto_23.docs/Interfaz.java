package propuesto23;

public class InterfazVentana extends javax.swing.JFrame {
    public InterfazVentana() {
        initComponents();
        txtSoluciones.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());
        CalculoEcuacion ecuacion = new CalculoEcuacion(a, b, c);
        String soluciones = ecuacion.calcularSoluciones();
        txtSoluciones.setText(soluciones);
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtSoluciones.setText("");
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


