package day031;

public class MainApp {
    public static void main(String[] args) {
        Uye uye1=new Uye();
        Kitap k1=new Kitap("Sefiller","Victor Hugo",500);
        Kitap k2=new Kitap("Kaşağı","Ömer Seyfettin",300);
        uye1.kitapAl(k1);
        uye1.kitapAl(k2);



    }
}
