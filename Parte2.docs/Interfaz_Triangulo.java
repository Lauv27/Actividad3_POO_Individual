package F_geometricas;

public class InterfazTriangulo extends javax.swing.JFrame {
    public InterfazTriangulo() {
        initComponents();
        txtArea.setEditable(false);
        txtPerimetro.setEditable(false);
        txtHipotenusa.setEditable(false);
    }

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {
        double area, perimetro, hipotenusa;
        double base = Double.parseDouble(txtBase.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        TrianguloRectangulo triangulo = new TrianguloRectangulo(base, altura);
        area = triangulo.calcularArea();
        perimetro = triangulo.calcularPerimetro();
        hipotenusa = triangulo.calcularHipotenusa();
        txtArea.setText(String.valueOf(area));
        txtPerimetro.setText(String.valueOf(perimetro));
        txtHipotenusa.setText(String.valueOf(hipotenusa));
    }

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtBase.setText("");
        txtAltura.setText("");
        txtArea.setText("");
        txtPerimetro.setText("");
        txtHipotenusa.setText("");
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}

