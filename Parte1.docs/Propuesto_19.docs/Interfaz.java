package propuesto19;

public class InterfazVentana extends javax.swing.JFrame {
    public InterfazVentana() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double longitud;
        longitud = Double.parseDouble(txtLongitud.getText());
        Calculos calculo = new Calculos(longitud);
        double area = calculo.calcularArea();
        double perimetro = calculo.calcularPerimetro();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {
        txtLongitud.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
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
