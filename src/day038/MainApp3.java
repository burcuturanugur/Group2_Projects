package day038;

public class MainApp3 {
    public static void main(String[] args) {
       /* String str="Merhaba";
        //alt alta yazdırma

        *//*for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }*//*

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }*/


        //Task: ey edip adanada pide ye cümlesini tersten yazdırınız.

        String str1="ey edip adanada pide ye";
        for (int i = str1.length()-1;i>=0; i--) {
            System.out.print(str1.charAt(i));


        }


    }
}
