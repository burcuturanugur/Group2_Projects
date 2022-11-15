package day029;

public class Koyun extends Hayvan{
    public Koyun() {
        System.out.println("Koyun nesnesi oluşturuldu.");
    }

    @Override
    public void beslen() {
        System.out.println("Koyun otla besleniyor.");
    }
}
