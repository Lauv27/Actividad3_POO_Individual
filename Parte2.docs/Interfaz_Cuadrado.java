package F_geometricas;

public class InterfazCuadrado extends javax.swing.JFrame {
    public InterfazCuadrado() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double area, perimetro;
        double lado = Double.parseDouble(txtLado.getText());
        Cuadrado cuadrado = new Cuadrado(lado);
        area = cuadrado.calcularArea();
        perimetro = cuadrado.calcularPerimetro();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtLado.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}
