package day040;

public class MainApp2 {
    public static void main(String[] args) {
        //contains and replace
        String str="Ben bir garip keloğlanım.";
        str.contains("kel");
       // boolean kelVarMi=str.contains("kel");

        boolean kelVarMi=str.toLowerCase().contains("KEL".toLowerCase());
        if (kelVarMi){
            System.out.println("Kel var.");
        }


    }


}
