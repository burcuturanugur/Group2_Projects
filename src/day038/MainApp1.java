package day038;

public class MainApp1 {
    public static void main(String[] args) {
        //String sınıfı instance methods
        String isim="Ahmet Dursun";
        if (isim.equals("ahmet dursun")){
            System.out.println("Aynıdır.");
        }
        if (isim.equalsIgnoreCase("ahmet dursun")){
            System.out.println("Aynıdır.");
        }
    }
}
