package day031.kutular;

public class RenkliKutu extends kutu{

    private String renk;

    public RenkliKutu() {
    }

    public RenkliKutu(int genislik, int derinlik, int yukseklik, String renk) {
        super(genislik, derinlik, yukseklik);
        this.renk = renk;
    } //Bu constructor buradan verileri alır. String renk altında genislik yükseklik vs assign etmeyiz de ata sınıfın
    //parametreli constructorını çağırırız.


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString(){
        return String.format("Renkli kutu: [%s %d x %d x %d ]",renk,getGenislik(),getDerinlik(),getYukseklik());
    }
}
