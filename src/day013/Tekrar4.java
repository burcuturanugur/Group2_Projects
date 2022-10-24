package day013;

public class Tekrar4 {
    public static void main(String[] args) {
        //Relational (Karşılaştırma) Operators
      /*  int x=5;
        int y=9;*/

        //false or false ---> false
        /*boolean result=x>y | 7>11;
        System.out.println(result);*/

        //    7 6 5 4 3 2 1 0
        //b1: 0 0 0 0 0 1 0 1
        //b2: 0 0 0 0 0 1 1 1
        //r&: 0 0 0 0 0 1 0 1 and için sonuç 5 çıkıyor dolayısıyla
        //r|: 0 0 0 0 0 1 1 1 veya için sonuç 7 çıkıyor
        //r^: 0 0 0 0 0 0 1 0 xor için sonuç 2 çıkar
       /* byte b1=5;
        byte b2=7;
        byte result=b1&b2;*/

        int b1=5;
        int b2=7;
        int result1=b1&b2;
        int result2=b1|b2;
        int result3=b1^b2;
        System.out.println("&: "+result1);
        System.out.println("|: "+result2);
        System.out.println("^: "+result3);






    }
}
