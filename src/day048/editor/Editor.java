package day048.editor;

import javax.swing.*;
import java.awt.*;

public class Editor extends JFrame {
    private JMenuBar menuCubugu;
    private JMenu dosya;
    private JMenuItem ac,kaydet,cikis;
    private JTextArea icerik;

    public Editor() throws HeadlessException {
        super("Metin Düzenleyici v1.0");
        setSize(800,600);
        //setLayout(null);
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        int x=screenSize.width-getWidth()/2;
        int y=screenSize.height-getHeight()/2;

        setLocation(x,y);

        menuTasarla();

        icerik=new JTextArea();
        add(icerik);
        


        setDefaultCloseOperation(EXIT_ON_CLOSE); //pencereyi kapatınca proggramın çalışması duruyor bu sayede
        setVisible(true);
    }

    private void menuTasarla() {
        //Menü Çubuğu
        menuCubugu=new JMenuBar();

        //Dosya
        dosya=new JMenu("Dosya");

        //Aç Menü Elemanı
        ac=new JMenuItem("Aç");;
        ac.addActionListener(e -> dosyaAc());
        dosya.add(ac);

        kaydet=new JMenuItem("Kaydet");
        kaydet.addActionListener(e -> dosyaKaydet());
        dosya.add(kaydet);

        //Ayraç
        dosya.addSeparator();


        //Çıkış Menü Elemanı
        cikis=new JMenuItem("Çıkış");
        cikis.addActionListener(e -> cikisYap());//Çıkış yap butonunun tıklanıp işlevsel hale gelmesini sağlıyor
        dosya.add(cikis);

        menuCubugu.add(dosya);


        setJMenuBar(menuCubugu);

    }

    private void dosyaKaydet() {
        JFileChooser fcKaydet=new JFileChooser();
        fcKaydet.showSaveDialog(this);
    }

    private void dosyaAc() {
       JFileChooser fcAc=new JFileChooser();
       fcAc.showOpenDialog(this);
    }

    private void cikisYap() {
        System.exit(0);
    }
}
