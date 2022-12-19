package day053;

import java.util.ArrayList;

public class MainApp1 {
    public static void main(String[] args) {
        //ArrayList
        ArrayList liste=new ArrayList();
        liste.add("Pazartesi");
        liste.add("Salı");
        for (var item:liste){
            System.out.println(((String) item).toUpperCase());
        }
    }
}
