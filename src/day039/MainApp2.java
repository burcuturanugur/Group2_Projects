package day039;

public class MainApp2 {
    public static void main(String[] args) {
        //Indexof ve substring
        String str="Merhaba kardeş!";
        String substring1 = str.substring(8);
        System.out.println(substring1);
        String substring2 = str.substring(8, 14);
        System.out.println(substring2);
        System.out.println(str.substring(8,str.length()));


        int indexSpace = str.indexOf(" ");
        System.out.println("Boşluğun index numarası:" +indexSpace);
        System.out.println(str.substring(indexSpace+1));
        int indexExc = str.indexOf("!");
        System.out.println("Ünlem işaretinin index numarası:" +indexExc);
        System.out.println(str.substring(indexSpace+1,indexExc));

        //TASK
        //Metindeki ilk kelime alınıp length'i ve kelimenin kendisi ekranda gösterilecektir.
        String substring3=str.substring(0,indexSpace);
        System.out.println(substring3);
        System.out.println(substring3.length());

    }
}
