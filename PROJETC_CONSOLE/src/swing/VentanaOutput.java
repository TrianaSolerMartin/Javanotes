package swing;

import javax.swing.JFrame;

public class VentanaOutput extends JFrame {

    public VentanaOutput() {
    }

    public void personalizarVentana() {
        this.setVisible(true);
        this.setTitle("GUI GRAPHIP USER INTERFACE");
        this.setSize(400, 300);
    }

    public static void main(String[] args) {
        VentanaOutput vo = new VentanaOutput();
        vo.setVisible(true);
        vo.setTitle("GUI GRAPHIP USER INTERFACE");
        vo.setSize(400, 300);
    }
}
