package day026.mathematic;

public class Islem {

    //Metotların overload edilmesinde (Aşırı yükleme ) metotların imzalarına  bakılır.İmza: Bir metotun imzası o metodun
    //parametreadetleri ve parametre tiplerinin çeşitliliğidir.
    //Metotların dönüş tipleri imzadan sayılmaz.



    public static int topla(int a,int b){
        return a+b;
    }
    public static double topla(double a,double b){ //Bu ikisi farklıdır çünkü imzaları farklıdır.
        return a+b;
    }

    public static int carp(int a,int b){
        //Static yazmazsak instance olur yani nesne oluştuktan sonra görülebilir o yuzden static yazmalıyız.
        return a*b;
    }
    public static int cikar(int a,int b){
        return a-b;
    }
    public static int bol(int a,int b){
        return a/b;
    }
}
