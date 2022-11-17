package day031;

public class Uye {
    private String adi;
    private String soyadi;
    private int no;
    private Kitap kitap;
    private Kitap[] kitaplar;

    public Uye() {
        kitaplar=new Kitap[1];
    }

    public Uye(String adi, String soyadi, int no) {
        this();
        //1.kural: constructor kendi ismiyle çağrılmayacak.Ya this ya super olmalı.
        //2. kural: Constructorlar ilk komut olarak çalıştırılmak zorundadır.
        //3. kural : Bir constructor içinden sadece bir adet constructor çağrılabilir

        this.adi = adi;
        this.soyadi = soyadi;
        this.no = no;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void kitapAl(Kitap kitap){
        kitaplar=new Kitap[1];
        kitaplar[0]=kitap;
        System.out.println(kitaplar[0]);
    }
}
