package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

/**
 *
 * @author Mariana
 */
public class Principal extends JFrame implements ActionListener{
    
    private JPanel pnTabela;
    private JButton jbInput, jbOutput, jbStore, jbSector, jbProduct, jbProvider;
    private JTable jtTable;
    private DefaultTableModel TableModel;
    private JLabel lblSector, lblProduct; // "nome" dos campos a serem preenchidos
    private JTextField txSector, txProduct;
    private JScrollPane scrRoll;
    
    public Principal(){
    setLayout(null);
        setTitle("Agenda");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Fechar aplicação em X
        setSize(670, 480); //Tamanho da janela (largura, altura);
        setLocationRelativeTo(null); //Centralizado
        getContentPane().setBackground(new Color(64, 64, 64));
        
        // ~~~~~~~~~~~~~~ FIELDS ~~~~~~~~~~~~~~~~
        lblSector = new JLabel ("Sector:");
        lblSector.setSize(50,25); // LARGURA X ALTURA ** TAMANHO
        lblSector.setLocation(30,20); // LARGURA X ALTURA ** LOCALIZAÇÃO
        lblSector.setForeground(Color.white);
        add(lblSector);
        
        txSector = new JTextField ();
        txSector.setSize(200,25);
        txSector.setLocation(85,20);
        add(txSector);
        
        lblProduct = new JLabel ("Product:");
        lblProduct.setSize(55,25); // LARGURA X ALTURA ** TAMANHO
        lblProduct.setLocation(320,20); // LARGURA X ALTURA ** LOCALIZAÇÃO
        lblProduct.setForeground(Color.white);
        add(lblProduct);
        
        txProduct = new JTextField ();
        txProduct.setSize(220,25);
        txProduct.setLocation(380,20);
        add(txProduct);
        
        // ~~~~~~~~~~~~~~ TABLE ~~~~~~~~~~~~~~~~
        pnTabela = new JPanel(null);
        pnTabela.setLayout(new GridLayout(1, 1));
        pnTabela.setLocation(10, 70);
        pnTabela.setSize(630, 250);
        add(pnTabela);

        String[] colunas = {"ID", "Product", "Quantity", "Sector", "Price"};
        TableModel = new DefaultTableModel(colunas, 5);
        jtTable = new JTable(TableModel);
        TableModel.setNumRows(0);
        scrRoll = new JScrollPane(jtTable,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        pnTabela.add(scrRoll);
        
        // ~~~~~~~~~~~~~~ BUTTONS ~~~~~~~~~~~~~~~~
        jbInput = new JButton("ENTRADA");
        jbInput.setSize(150, 70);
        jbInput.setLocation(10, 340);
        jbInput.setBackground(new Color(81, 195, 66));
        jbInput.addActionListener(this);
        //Change color of button
        jbInput.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbInput.setBackground(new Color(82, 176, 70)); } // Color selected

            public void mouseExited(MouseEvent me) {
                jbInput.setBackground(new Color(81, 195, 66));}
        }); // Color in normal state
        add(jbInput);
        
        jbOutput = new JButton("SAÍDA");
        jbOutput.setSize(150, 70);
        jbOutput.setLocation(175, 340);
        jbOutput.setBackground(new Color(81, 195, 66));
        jbOutput.addActionListener(this);
        //Change color of button
        jbOutput.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbOutput.setBackground(new Color(82, 176, 70)); } // Color selected

            public void mouseExited(MouseEvent me) {
                jbOutput.setBackground(new Color(81, 195, 66));}
        }); // Color in normal state
        add(jbOutput);
    
        jbStore = new JButton("LOJA");
        jbStore.setSize(148, 30);
        jbStore.setLocation(335, 340);
        jbStore.setBackground(new Color(81, 195, 66));
        jbStore.addActionListener(this);
        //Change color of button
        jbStore.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbStore.setBackground(new Color(82, 176, 70)); } // Color selected

            public void mouseExited(MouseEvent me) {
                jbStore.setBackground(new Color(81, 195, 66));}
        }); // Color in normal state
        add(jbStore);
        
        jbProvider = new JButton("FORNECEDOR");
        jbProvider.setSize(148, 30);
        jbProvider.setLocation(335, 380);
        jbProvider.setBackground(new Color(81, 195, 66));
        jbProvider.addActionListener(this);
        jbProvider.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbProvider.setBackground(new Color(82, 176, 70)); } // Color selected

            public void mouseExited(MouseEvent me) {
                jbProvider.setBackground(new Color(81, 195, 66));}
        }); // Color in normal state
        add(jbProvider);
        
        jbSector = new JButton("SETOR");
        jbSector.setSize(148, 30);
        jbSector.setLocation(490, 340);
        jbSector.setBackground(new Color(81, 195, 66));
        jbSector.addActionListener(this);
        //Change color of button
        jbSector.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbSector.setBackground(new Color(82, 176, 70)); } // Color selected

            public void mouseExited(MouseEvent me) {
                jbSector.setBackground(new Color(81, 195, 66));}
        }); // Color in normal state
        add(jbSector);
        
        jbProduct = new JButton("PRODUTO");
        jbProduct.setSize(148, 30); //Largura x Altura
        jbProduct.setLocation(490, 380);
        jbProduct.setBackground(new Color(81, 195, 66));
        jbProduct.addActionListener(this);
        //Change color of button
        jbProduct.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                jbProduct.setBackground(new Color(82, 176, 70)); } // Color selected

            public void mouseExited(MouseEvent me) {
                jbProduct.setBackground(new Color(81, 195, 66));}
        }); // Color in normal state
        add(jbProduct);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == jbSector){
            NewFields nf = new NewFields();
            nf.setVisible(true);  
        }
        
        if (ae.getSource() == jbStore){
            NewFields nf = new NewFields();
            nf.setVisible(true);  
        }
        
        if (ae.getSource() == jbProvider){
            NewFields nf = new NewFields();
            nf.setVisible(true);  
        }
        
        if (ae.getSource() == jbProduct){
            NewProduct np = new NewProduct();
            np.setVisible(true);  
        }
    }
}
