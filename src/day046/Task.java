package day046;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //Task 1: Kayıtlı bir dosyanın var olup olmadığını kontrol edip silen Java programını yazınız.
        //(java.io.File sınıfı kullanılacaktır.)
        //Dosya'ya erişilip, ekranda gösterilecek. Silmek ister misiniz diye sorulacak.
        //Cevap evet ise dosya silinecek. Başarılı şekilde silindi mesajı verilecektir.

        String fileName="files/silinecekdosya";


        try {
            File file = new File("files/silinecekdosya.txt");
            //sout(file.getAbsolutePath()); dosyanın tam konumuna erişebiliyoruz.
            if (file.exists()) {
                System.out.println("Aradığınız dosya: " + file.getName() + "  Silmek ister misiniz?");
                Scanner input = new Scanner(System.in);
                String cevap = input.nextLine();
                if (cevap.equalsIgnoreCase("Evet")) {
                    file.delete();
                    System.out.println("Dosya başarılı bir şekilde silindi.");
                } else {
                    System.out.println("Dosyaya erişilemedi.");

                }
            }
        }catch (Exception ex){
            System.out.println("Bir hata oluştu." +ex.getMessage());
        }



        }
    }

