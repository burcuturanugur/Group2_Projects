package day029;

public class MainApp3 {
    public static void main(String[] args) {
        Hayvan hy=new Kedi();
        //Kedi k=(Kedi) hy; //Cast etmek oluyor
        //k.avlan();//Birden fazla kez kullanacaksak bunu tercih etmeliyiz
        //Bunun yerine
        ((Kedi)hy).avlan(); //Bu şekilde de avlana erişebiliriz.Tek seferlik kullanacaksak tercih etmeliyiz.
    }
}
