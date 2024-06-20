package fecha;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaSalida extends JFrame {

    Container contenedor = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scrollpane = new JScrollPane();

    public VentanaSalida() {
        personalizarVentana();
        personalizarTextArea();
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/CERTIFICADO JUNIO 2024.png");//creo objeto de imagen
        Image image = icono.getImage(); //recupero el objeto
        this.setIconImage(image);//con seticonimage cambiamos el icono 

        this.setSize(580, 395);//ancho y alto 
        this.setResizable(false);//que no se redimensione
        this.setLocationRelativeTo(null);
        this.setVisible(true);//que se muestre la ventana 
    }
    
    public static void main (String[]arg){
    VentanaSalida vs = new VentanaSalida();
    }
    
    public void personalizarTextArea (){
    txaContenido.setBackground(Color.pink);
    txaContenido.setFont(new Font("Courier New", Font.BOLD, 14));
    txaContenido.setForeground(Color.black);
    
    scrollpane.setViewportView(txaContenido);//poner scroll en textarea
    
    contenedor.add(scrollpane);
            }
    
}
