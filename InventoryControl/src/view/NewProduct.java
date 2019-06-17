package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Mariana
 */
public class NewProduct extends JFrame {
    private JButton jbRegister, jbCancel;
    private JLabel jlName, jlPrice, jlSector;
    private JTextField txName, txPrice, txSector;

    public NewProduct(){ 
    setLayout(null);
    setTitle("New");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(450, 200); 
    setLocationRelativeTo(null); 
    getContentPane().setBackground(new Color(64, 64, 64));
        
    // ~~~~~~~~~~~ FIELDS ~~~~~~~~~~~~~~~~
    jlName = new JLabel ("Name: ");
    jlName.setSize(50,25); // LARGURA X ALTURA ** TAMANHO
    jlName.setLocation(30,40); // LARGURA X ALTURA ** LOCALIZAÇÃO
    jlName.setForeground(Color.white);
    add(jlName);
    
    txName = new JTextField();
    txName.setSize(300,25); // LARGURA X ALTURA ** TAMANHO
    txName.setLocation(80,40); // LARGURA X ALTURA ** LOCALIZAÇÃO
    txName.setForeground(Color.white);
    add(txName);
    
    // ~~~~~~~~~ BUTTONS ~~~~~~~~~~ 
    jbRegister = new JButton("REGISTER");
    jbRegister.setSize(150,35);
    jbRegister.setLocation(60,80);
    jbRegister.setBackground(new Color(81, 195, 66));
    jbRegister.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbRegister.setBackground(new Color(82, 176, 70)); } 

            public void mouseExited(MouseEvent me) {
                jbRegister.setBackground(new Color(81, 195, 66));}
        }); 
        add(jbRegister);
        
    jbCancel = new JButton("CANCEL");
    jbCancel.setSize(150,35);
    jbCancel.setLocation(240,80);
    jbCancel.setBackground(new Color(81, 195, 66));
    jbCancel.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbCancel.setBackground(new Color(82, 176, 70)); } 

            public void mouseExited(MouseEvent me) {
                jbCancel.setBackground(new Color(81, 195, 66));}
        }); 
        add(jbCancel);
    }
}
