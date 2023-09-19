package F_geometricas;

public class InterfazCirculo extends javax.swing.JFrame {
    public InterfazCirculo() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
    }

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {
        double area, perimetro;
        double radio = Double.parseDouble(txtRadio.getText());
        Circulo circulo = new Circulo(radio);
        area = circulo.calcularArea();
        perimetro = circulo.calcularPerimetro();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
    }

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtRadio.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}
