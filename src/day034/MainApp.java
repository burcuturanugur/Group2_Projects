package day034;

public class MainApp {
    public static void main(String[] args) {
        // jagged diziler : eleman sayıları farklı olan dizilerin dizisidir.
        // int [][] notlar= new int [5][3];bu matris

       /* String[][] zaman=new String[3][];
        // haftanın günleri
        zaman[0]=new String[7];
        zaman[0][0]="pazartesi";
        zaman[0][1]="salı";

        // yılın ayları
        zaman[1]=new String[12];
        zaman[1][0]="ocak";
        //mevsimler
        zaman[2]=new String[4];
        zaman[2][0]="İlkbahar";*/

        String[][] zaman={
                {"pzt","sal","çar","per","cum","cmt","paz"},
                {"O","Ş","M","N","MA","H","T","A","EY","EK","K","AR"},
                {"İLKBAHAR","YAZ","SONBAHAR","KIŞ"},
        };
        System.out.println(zaman.length);
        System.out.println("ilk eleman : "+zaman[0].length+"elemanlıdır .");
        System.out.println("ikinci eleman : "+zaman[1].length+"elemanlıdır .");
        System.out.println("üçüncü eleman : "+zaman[2].length+"elemanlıdır .");

        int toplamElemanSayisi=0;

        for (int i = 0; i < zaman.length; i++) {
            toplamElemanSayisi=zaman[i].length;
        }
        System.out.println("toplam eleman sayısı: "+toplamElemanSayisi);
        for (int i = 0; i < zaman.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(zaman[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
