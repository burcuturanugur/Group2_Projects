package day044;

import static day044.MainApp.calculateAverage;

public class MainApp2 {
    public static void main(String[] args) {
        int[] dizi=new int[]{3,5,7,9};
        //dizi=null;


        double average= 0;
        try {
            average = calculateAverage(dizi);
        } catch (Exception e) {
            System.out.println("Hata: " +e.getMessage());
           // throw new RuntimeException(e);
        }
        System.out.println("Ortalama = " +average);
    }
    public static double calculateAverage(int[] values)throws Exception {
        if(values==null) throw new Exception("Values null olamaz.");
        double sum=0.0;
        try {


        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum/values.length;
        }catch (Exception ex){
            System.out.println("Bir hata oluştu.");
        }
        return  sum/values.length;
    }
}
