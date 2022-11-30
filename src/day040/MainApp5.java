package day040;

public class MainApp5 {
    public static void main(String[] args) {
        //StringBuilder,StringBuffer
        StringBuilder sb=new StringBuilder("Merhaba!");

        sb.append("Nasılsın?");
        sb.append(5); //String appendi seçmemize rağmen 5i yazdırabildik.

        sb.insert(8,"Kardeş.");//8. indexe immutable etmiş olduk.

       // sb.reverse();//Tam tersine döndürüyor.
        System.out.println(new StringBuilder("Burcu uğur").reverse());
        //nesne değişmez sadece yazdırırken çıktı değişiyor.

        sb.delete(8,14);

        System.out.println(new StringBuilder().append("Merhaba").insert(0,"Ahmet").reverse());

        System.out.println(sb);
    }
}
