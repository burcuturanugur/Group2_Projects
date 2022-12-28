package day060.yaris;

import javax.swing.*;
import java.awt.*;

public class form extends JFrame {

    private Otomobil o1;
    private Otomobil o2;

    public form() throws HeadlessException {

         super("Otomobil yarışı");
            setLayout(null);
            setSize(800,600);
            Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize(); //formu merkeze yerleştirmek için screensize a ihtiyacımız var
            int x=(screenSize.width-getWidth())/2;
            int y=(screenSize.height-getHeight())/2;
            setLocation(x,y);
            tasarla();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
    }

    private void tasarla() {
        o1=new Otomobil();
        o1.setLocation(50,50);
        add(o1);

        o2=new Otomobil();
        o2.setLocation(50,120);
        add(o2);

    }
}
