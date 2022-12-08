package day045;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
        /*
        1. try-catch
        2. try-catch-catch
        3. try-catch-finally

        Checked exception:Derleme zamanı sorun çıkaran hatalardır.
        */

        char[] buffer=new char[8];
        try {
            FileReader fr = new FileReader("files/deneme.txt");
            int okunanMiktar = fr.read(buffer);
            System.out.println("Okunan karakter adedi: " +okunanMiktar);
            for (int i = 0; i <okunanMiktar; i++) {
                System.out.print(buffer[i]);
            }
        }catch ( IOException | ArrayIndexOutOfBoundsException | NullPointerException ex){
            System.err.println(ex.getMessage());
        }

        /*catch (IOException ex){
            System.err.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }*/
    }
}
