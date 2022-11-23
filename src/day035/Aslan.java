package day035;

public class Aslan extends Hayvan implements Avci,Yuzucu{
    @Override
    public void avlan() {
        System.out.println("Aslan avlanıyor.");
    }

    @Override
    public void yuz() {
        System.out.println("Aslan yüzüyor.");
    }
    //Kendisinin gövdesiz metodlarını implemente etmemizi yani gövdeli hale getirmemizi dayatır.




}
