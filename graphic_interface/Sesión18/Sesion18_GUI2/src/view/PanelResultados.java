package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel {

    private JTextArea camporesultados;

    public PanelResultados() {
        setLayout(new BorderLayout());

        inicializarComponentes();

        setVisible(true);
    }

    public void inicializarComponentes() {

        setBackground(Color.GREEN);
        setBorder(new TitledBorder("Módulo de resultados:"));

        camporesultados = new JTextArea();
        JScrollPane pScroll = new JScrollPane(camporesultados, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        add(pScroll, BorderLayout.CENTER);

    }

    public JTextArea getCamporesultados() {
        return camporesultados;
    }

    public void setCamporesultados(JTextArea camporesultados) {
        this.camporesultados = camporesultados;
    }

}
