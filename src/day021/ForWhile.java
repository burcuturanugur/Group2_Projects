package day021;

public class ForWhile {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) { //Bazılarını yazdırmak istemeyiz mesela
            if (i%2==0){
                continue; //sadece tek sayıları yazdırır. Continue: Görevi if döngüsüne geldi şart sağlanmışsa true der
                //aşağıdaki işlerle uğraşmayıp döngüyü bir sonraki adıma götürür.
                //Break kesip bırakır. Döngüye devam ettirmez tamamen kesip atar.
            }

            System.out.print(i+ " ");
            
        }
    }
}
