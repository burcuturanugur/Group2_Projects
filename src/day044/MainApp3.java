package day044;

import javax.swing.*;

public class MainApp3 {
    public static void main(String[] args) {
        /*
        1. Scanner

        2.JOptionPane.showInputDıalog
        */


       /* String str=null;
        System.out.println(str.toUpperCase());*/

        String isim= JOptionPane.showInputDialog("İsminiz:");
        try {
            System.out.println("Merhaba " + isim.toUpperCase());
            System.out.println(isim.charAt(0));
          //  byte x=(byte)isim.charAt(1);
        }catch (NullPointerException ex){
            System.out.println("Bir hata oluştu. Hata: " +ex.getMessage());
        }catch (StringIndexOutOfBoundsException ex){ //Bu catch ile diğer cathin bloğu farklı old. için ex parametreleri sorun olmaz
            System.out.println("Bir hata oluştu. Hata : " +ex.getMessage());

        }
    }
}
