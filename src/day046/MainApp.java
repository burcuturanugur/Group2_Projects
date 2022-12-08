package day046;

import java.io.File;
import java.io.FileReader;

public class MainApp {
    public static void main(String[] args) {

        File file = new File("files/metin.txt");
        if (file.exists()) {
            System.out.println("Dosya bulundu.");
           /* if (file.delete()){ //Texti siler bu komut
                System.out.println("Dosya silindi.");*/
        }else{
            System.out.println("Dosya bulunamadı");
        }
    }

}

