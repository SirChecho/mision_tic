
package view;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel {
    
    public PanelOpciones (){
        setLayout(null);
        setBackground(Color.black);
        ImageIcon logof = new ImageIcon(getClass().getResource("../imagenes/logoFerreteria.png"));
        ImageIcon icono = new ImageIcon(logof.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        JLabel ferre = new JLabel();
        ferre.setIcon(icono);
        ferre.setBounds(0, 0, 250, 250);
        add(ferre);
        ImageIcon logom = new ImageIcon(getClass().getResource("../imagenes/mision logo.png"));
        ImageIcon iconom = new ImageIcon(logom.getImage().getScaledInstance(411, 250, Image.SCALE_DEFAULT));
        JLabel mision = new JLabel();
        mision.setIcon(iconom);
        mision.setBounds(250, 0, 411, 250);
        add(mision);
        setVisible(true);
    }
}
