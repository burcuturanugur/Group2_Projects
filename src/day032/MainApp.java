package day032;

public class MainApp {
    public static void main(String[] args) {

        Personel per1=new Personel();
        /*int sicilNo = per1.getSicilNo();
        per1.setSicilNo(5); //Burdaki 5 arguman olur ancak personel classında parantez içi parametre olur.*/
        per1.setAdi("Burcu");
        per1.setSoyadi("Uğur");
        per1.setSicilNo(1);
        per1.setIseGirisYili(1990);
        per1.setMaasi(5000);

        per1.iseBasla();
        per1.molaVer();
        per1.paydosYap();

        if (Personel.maasaZamYap(per1,-10)){
            System.out.println("Zam yapıldı.");
        }else {
            System.out.println("Zam yapılamadı.");
        }

        per1=null;

        System.out.println("Maaş : " +per1.getMaasi());

        if (!Personel.maasaZamYap(per1,10)){
            System.out.println("Başarısız");
        }



    }

}
