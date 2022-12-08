package day046;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mainapp5 {
    public static void main(String[] args) {
        //compile timeda yönetmek zorunda olduğumuz hatalara checked exceptions diyoruz.
        FileReader fr = null;
        try {
            fr = new FileReader("files/meti.txt");
            fr.read();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosyadan veri okunamadı.");
        } finally {
            try {
                fr.close();
            } catch (IOException|NullPointerException e) {
                System.out.println("Dosya kapatılamadı.");
            }
            //her blokun içerisinde tanımlanan değişkenler o blok içerisinde geçerli old. için FileReaderi
            // daha üst blokta tanımlamamız gerekir.
        }
    }
}
