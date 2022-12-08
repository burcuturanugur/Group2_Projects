package day046;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp3 {
    public static void main(String[] args) {
        File file=new File("files/metin.txt");
        try {
            FileReader fr=new FileReader(file);
            char[] buffer=new char[1024];
            int okunan = fr.read(buffer);
            for (int i = 0; i <= buffer.length; i++) {
                System.out.print(buffer[i]);
            }
            System.out.println("----------------------");
            fr.close();//açık bi dosyayı kapattırmak da hata fırlattırıyor o yuzden catch ekliyoruz.
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) { //fr.close un catchi
            e.printStackTrace();
        }
    }
}
