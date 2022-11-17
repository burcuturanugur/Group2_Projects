package day031.kutular;

public class kutu {
    private int genislik;
    private int derinlik;
    private int yukseklik;

    //Constructorlar buraya yazılır.
    //Bir parametreli constructor yazıldığında parametresiz constructor yok olur/silinir. Yine de olsun istiyorsak
    // (ki istemek  zorundayız) parametresiz bir constructor yazarız.



    public kutu() {
        /*genislik=1;
        derinlik=1;
        yukseklik=1; *///ya da
        //genislik=derinlik=yukseklik=1; //yapabiliriz ya da constructor çağırabiliriz aşağıdaki gibi
        //parametresiz constructordan parametreliyi çağırmış olduk
        this(1,1,1);
    }

    public kutu(int genislik, int derinlik, int yukseklik) {
       // this.genislik = genislik;
        setGenislik(genislik);
        this.derinlik = derinlik;
        this.yukseklik = yukseklik;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        // if (genislik<1) return; //setGenislik(genislik) yazdığımızda doğru çalışmaz bu yuzden başka bir yöntem uygulamak
        //gerekir.
        if (genislik>0) {
            this.genislik = genislik;
        }else {
            this.genislik=1;
        }//bu yuzden böyle çözebiliriz ama bu da tam bir çözüm değildir.


     /*   if (genislik<1)throw new Exception("Genişlik 1'den küçük olamaz.");
        this.genislik=genislik;
        bu kesin bir çözümdür*/

        //statik yazdığımızda o statik nesneye ait değildir sınıfa ait bir şeydir.
    }

    public int getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(int derinlik) {
        if (derinlik>0) {
            this.derinlik = derinlik;
        }else {
            this.derinlik=1;
        }
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        if (yukseklik>0) {
            this.yukseklik = yukseklik;
        }else {
            this.yukseklik=1;
        }
    }
    public int getHacim(){
        return genislik*derinlik*yukseklik;
    }

    @Override
    public String toString() {
        return String.format("Kutu: [%dx%dx%d]",genislik,derinlik,yukseklik);
    }
}
