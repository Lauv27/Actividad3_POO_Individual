package F_geometricas;

public class InterfazPrincipal extends javax.swing.JFrame {
    public InterfazPrincipal() {
        initComponents();
    }

    private void CirculoActionPerformed(java.awt.event.ActionEvent evt) {
        InterfazCirculo circulo = new InterfazCirculo();
        circulo.setVisible(true);
    }

    private void RectanguloActionPerformed(java.awt.event.ActionEvent evt) {
        InterfazRectangulo rectangulo = new InterfazRectangulo();
        rectangulo.setVisible(true);
    }

    private void CuadradoActionPerformed(java.awt.event.ActionEvent evt) {
        InterfazCuadrado cuadrado = new InterfazCuadrado();
        cuadrado.setVisible(true);
    }

    private void TrianguloActionPerformed(java.awt.event.ActionEvent evt) {
        InterfazTriangulo triangulo = new InterfazTriangulo();
        triangulo.setVisible(true);
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
}

