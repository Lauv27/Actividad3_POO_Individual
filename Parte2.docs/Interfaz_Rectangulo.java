package F_geometricas;

public class InterfazRectangulo extends javax.swing.JFrame {
    public InterfazRectangulo() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
    }

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {
        double area, perimetro;
        double base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        Rectangulo rect = new Rectangulo(base, altura);
        area = rect.calcularArea();
        perimetro = rect.calcularPerimetro();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtBase.setText("");
        txtAltura.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}
