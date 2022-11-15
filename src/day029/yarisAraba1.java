package day029;

public class yarisAraba1 extends Araba {
    public void turbo() {
        System.out.println("Yarış arabası turbo ile uçuyor.");
    }


    @Override
    public void ilerle() {
        System.out.println("Yarış arabası hızla ilerliyor.");
    }
}

