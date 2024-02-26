import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Mosaico extends JFrame{
    Color[] colores = {Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, Color.WHITE, Color.RED, Color.BLUE, Color.BLACK, Color.BLACK, Color.GREEN, Color.YELLOW, Color.WHITE, Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK};
    public Mosaico(){
        GridLayout layout = new GridLayout(4,4);
        setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for(int i = 0; i < 16; i++)
        {
            JPanel p = new JPanel();
            p.setBackground(colores[i]);
            add(p);
        }

        setBounds(0, 0, 300, 300);
        setVisible(true);
    }
}