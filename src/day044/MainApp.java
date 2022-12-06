package day044;

public class MainApp {
    public static void main(String[] args) {
        /*
    The advantages of Exception Handling in Java are as follows:

    1. Provision to Complete Program Execution: Programlarımızın çalışmasının (yürütülmesinin) tamamlanması için önlem
    2. Easy Identification of Program Code and Error-Handling Code: Program kodu içinde hata yönetiminin kolayca ele alınabilmesi
    3. Propagation of Errors: Hataların, metotların çağrıldığı yere  yayılabilmesi
    4. Meaningful Error Reporting: Güzel bir şekilde hataların raporlandırılabilmesi
    5. Identifying Error Types: Hata türlerini belirleyebilme


    Keywords
    1. try
    2. catch
    3. finally
    4. throw
    5. throws

    */
        // KULLANIM YÖNTEMLERİ
        // TRY-CATCH

        try {
            int sayac=0;
            String[] isimler={"Ali","Veli","Ayşe","Fatma"};
            sayac=4;
            System.out.println(isimler[sayac]);
            //hata fırlatıldı yani throw

            // catch içine (NullPointerException ex) de yazabilirim
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Hata: " +ex.getMessage());
        }


        double average = calculateAverage(new int[]{3, 5, 7, 9});
        System.out.println("Ortalama =" +average);


    }
    
    public static double calculateAverage(int[] values){
        double sum=0.0;
        for (int value:values) {
            sum += value;
        }
        return  sum/values.length;

            
        }
    }

