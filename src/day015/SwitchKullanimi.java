package day015;

public class SwitchKullanimi {
    public static void main(String[] args) {
        int gun=99;
        switch (gun){

            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Salı");break;
            case 3:
                System.out.println("Çarşamba");break;
            case 4:
                System.out.println("Perşembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Yanlış seçim");break;//Örn: 99 sayısını girdik. Bu sonucu verir.
            //Her default yazdığımızda mutlaka break koymamıza gerek yok ama bu örnekte yanlış bir seçim yapılınca
            //diğerlerinin görünmemesi için break koymalıyız.
            //Ayrıca default'u istediğimiz yere yazabiliriz. Başa ya da sona.
        }

//break imleci buraya atar
        System.out.println("Switch'ten çıkıldı.");

        //breakleri yazmazsak break'i görene kadar her şeyi yazdırır ve break'i görene kadar devam eder.

    }
}
