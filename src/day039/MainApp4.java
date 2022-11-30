package day039;

import javax.swing.*;

public class MainApp4 {
    public static void main(String[] args) {
        //TASK: Verilen ismin (ad,soyad ) baş harflerini tutan fakat geri kalan harflerin yerine asteriks (*)karakteri
        //koyan ve metni geriye döndüren bir metot yazınız. Metodun ismi hideNames olacaktır.
        //2. Klavyeden isim alınıp , ekranda örnekteki gibi gösterim yapılacaktır.Örn; Ahmet Dursun
        //A**** D*****

        //System.out.println(hideNames("Burcu Uğur"));
        String i̇sim = JOptionPane.showInputDialog(null, "İsminizi giriniz : ", "İsim gizleme", JOptionPane.PLAIN_MESSAGE);
        System.out.println(hideNames(i̇sim));

    }
  /* 2. YÖNTEM
  public static String hideNames(String isim){
        int indexSpace=isim.indexOf(" ");
        String first=""+isim.charAt(0);
        String second=""+isim.charAt(indexSpace+1);
        String s=""+isim.substring(indexSpace+2);


        return first+"*".repeat(indexSpace-1)+" "+second+"*".repeat(isim.length()-(indexSpace+2));*/

    public static String hideNames(String name){
        int indexSpace=name.indexOf(" ");
        String tmp=" ";
        for (int i = 0; i < name.length(); i++) {
            if (i==0){
                tmp+=name.charAt(i);
            }else if (i==indexSpace+1){
                tmp+=" "+name.charAt(indexSpace+1);
            }else {
                tmp+="*";
            }

        }
        return tmp;
    }

    }

