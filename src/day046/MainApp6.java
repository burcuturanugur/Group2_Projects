package day046;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp6 {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("file/metin.txt")){
            //Tryı sanki metodmuş gibi tanımladık. Hatayı gidermeye çalıştığımızda iki catch atadı. Çünkü biri açmak,
            //diğeri de okumak için
            //Try ın parantezi içindeki nesnelerin otocloseable olması gerekir.Her açılan dosyayı otomatik kapatıyor
            // biz kapatmakla uğraşmıyoruz. Bu java 7den sonra gelen bir özelliktir.

            fr.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
