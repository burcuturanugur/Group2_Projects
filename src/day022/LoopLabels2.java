package day022;

public class LoopLabels2 {
    public static void main(String[] args) {
        Etiket1:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i*j!=0){
                   // break Etiket1;
                    break;
                }
                System.out.printf("%dx%d\n",i,j); //i ve j 0ken ifin içindeki statement false olduğu için break soutf'ye
                //girer ve yazdırır. Bırakıp çıkamaz yani sonraki döngüye girer.Tek döngüde break ile etikete breakin
                // hiçbir farkı yok. iç içede etiketin bulunduğu döngüde break edilir diğeri çalışmaya devam eder.

            }
            System.out.println();

        }
    }
}
