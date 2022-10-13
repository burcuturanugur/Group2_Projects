package day07;

public class EscapeCharacters {
    public static void main(String[] args) {
        //Escape characters


        //Öğretmen "Çocuklar lütfen sessiz olur musunuz?" dedi.
        String adi="Ahmet";


        //Metnin tırnak işaretlerinin içinde yazdırılması için ters slash kullanmamız gerekir.
        String metin="Öğretmen, \"Çocuklar lütfen sessiz olur musunuz?\" dedi.";
        System.out.println(metin);


        //Program files'ın slashının yazılabilmesi için arka arkaya çift slash kullanılır.
        //Ters slash problem çıkarabilecek kullanımları önlemiş oluyor.
        String klasorAdi="c:\\Program Files\\Java";
        System.out.println(klasorAdi);

        //Herhangi bir yerden link yapıştırdığımızda otomatik olarak ters slashları ekliyor.
        String path="C:\\Users\\burcu\\Desktop\\GUIDERSOFT\\grup2\\gitprojects\\project2";
         System.out.println(path);

    }
}
