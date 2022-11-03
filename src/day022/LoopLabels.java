package day022;

public class LoopLabels {
    public static void main(String[] args) {

        Etiket1: //
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            if (i==5){
                break Etiket1;// normal break edince de aynı şekilde çalışır
            }

        }
    }
}
