package day060;

public class MainApp {
    public static void main(String[] args) {
        //Multithreading

        Thread thread=Thread.currentThread();
        thread.setName("MyThread");
        System.out.println("Şuan çalışan kanal: "+thread.getName());
        System.out.println("Şuan çalışan kanal ıd: "+thread.getId());
       // System.out.println(1/0);
    }
}
