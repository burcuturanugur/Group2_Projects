package day030.kutuphanepro;

public class Kitap {
    private boolean gecerliMi;
    private String adi;
    private String yazari;
    private int sayfaSayisi;

    //getterların bir dönüş tipi var. Setterların dönüş tipi yok yani(void)
    //private üyelere erişmek için public yöntemler geliştiriyoruz yani getter setterlar metodlara benzer.

    public Kitap(){
    }

    public Kitap(String adi, String yazari, int sayfaSayisi) {
        gecerliMi=true;
        setAdi(adi);
        setYazari(yazari);
        setSayfaSayisi(sayfaSayisi);

    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        if (adi!=null&!adi.isEmpty()&!adi.isBlank()) {
            this.adi = adi;
        }else {
            gecerliMi=false;
            System.err.println("Kitap adı boş olamaz.");
        }
    }

    public String getYazari(String s) {
        return yazari;
    }

    public void setYazari(String yazari) {
        if (yazari!=null&!yazari.isEmpty()&!yazari.isBlank()) {
            this.yazari = yazari;
        }else {
            gecerliMi=false;
            System.err.println("Yazarı boş olamaz.");
        }    }

    public int getSayfaSayisi() {

        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        if (sayfaSayisi > 0) {
            this.sayfaSayisi = sayfaSayisi;
        }else {
            gecerliMi=false;
            System.err.println("Sayfa sayısı negatif olamaz.");

        }
    }

    public void kaydet(){
        if (gecerliMi) {
            System.out.println(this + " veri tabanına kaydedildi.");
        }else {
            System.out.println("Kayıt işlemi başarısız.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s(%s: %d)",adi,yazari,sayfaSayisi);

    }
}
