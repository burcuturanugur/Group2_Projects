package day046;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainApp7 {
    public static void main(String[] args) {
        //  Kayıtlı bir dosyanın var olup olmadığını kontrol edip silen Java programını yazınız.
        //(java.io.File sınıfı kullanılacaktır.)
        //Dosya'ya erişilip, ekranda gösterilecek. Silmek ister misiniz diye sorulacak.
        //Cevap evet ise dosya silinecek. Başarılı şekilde silindi mesajı verilecektir.
        File file = new File("src/day46/Metin");
        FileReader fr = null;
        if (file.isFile()) {
            System.out.printf("%s bir dosyadır:", file.getName());
        } else if (file.isDirectory()) {
            System.out.printf("%s bir klasördür:", file.getName());
        }
        System.out.println("Dosyayı silmek ister misiniz: y/n");
        Scanner input = new Scanner(System.in);
        String ans = input.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            file.delete();
            System.out.println("dosya başarılı şekilde silindi");
        } else {
            System.out.println(file.getName());

            try {
                fr = new FileReader(file);
                char[] buffer = new char[1024];
                int okunan = fr.read(buffer);
                for (int i = 0; i < okunan; i++) {
                    System.out.print(buffer[i]);
                }
            } catch (FileNotFoundException e) {
                //e.printStackTrace(); hatayı tüm detayıyla göösteriyor.
            } catch (IOException e) {
              //  e.printStackTrace();

            } finally {
                try {
                    fr.close();
                } catch (IOException | NullPointerException e) {
                    System.out.println("dosya kapatılamadı");

                }

            }


        }
    }}