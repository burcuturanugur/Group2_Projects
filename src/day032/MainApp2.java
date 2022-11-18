package day032;

public class MainApp2 {
    public static void main(String[] args) {
        Mudur md1=new Mudur();
        md1.setMaasi(10000);
        md1.iseBasla();

       /* md1.molaVer();

        md1.gorevYap();*/

        //Bir ata sınıf (Personel), kendisinden türemiş (extends) alt sınıf (Müdür) örneklerine (nesnelerine,objects)
        //referans olabilir.
        Personel p=new Mudur();
        //Mudur nesnesine personel sınıfı referanslık yapıyor.
        p.gorevYap();


        //AŞAĞIDAKİLER YANLIŞ !!! ALT SINIFTAN ÜST SINIFA REF. VS OLMAZZZ!!!1
        //Mudur m4=new Personel();
        //Personel p2=new Scanner(System.in)


    }



    }

