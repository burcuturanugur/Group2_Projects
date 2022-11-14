package day026.mathematic;

public class DortIslem {
    public int sayi1;
    public int sayi2;

    //constructorda void bile yazılmaz sınıfın kendi ismiyle yazılır
    //Bir veri içinde lokal variable ile instance variable çakışırsa lokal variable geçerli olur.
    public DortIslem(int sayi1,int sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;

        //This'in burada herhangi bir anlamı yok aslında.İşlem1 nesnesi oluştuğunda this anahtar kelimesi heapte oluşan
        //islem1 nesnesini işaret eder.Aynı şey işlem2 için de geçerli.
    sayi1=sayi1;
    sayi2=sayi2;
    }




    public int topla(){
        return sayi1+sayi2;


    }
    public int carp(){
        return sayi1*sayi2;
    }


}
