package day021;

public class Array100 {
    public static void main(String[] args) {
        int [] numbers={40,50,10,20,70};
        //System.out.println(numbers[4]); //Bu çok düşük maliyetlidir mesela.Maliyeti: 0(1)'dir.
        //İçerisinde 10 değeri var mı diye bakarsak
        int arananDeger=10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==arananDeger){
                System.out.println("Aranan değer bulundu. Sıra no:  " +(i+1));
            }
        }//Maliyeti : 0(n)
    }
}
