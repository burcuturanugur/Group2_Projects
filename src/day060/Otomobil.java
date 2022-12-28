package day060;

public class Otomobil extends Thread{

    private int hiz;

    public Otomobil(String name,int hiz){
        super(name);
        this.hiz=hiz;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s %d m ilerledi. \n",Thread.currentThread().getName(),(i+1)*10);
            try {
                Thread.sleep(1000-(hiz*10)); //yarım saniyede bir gelmiş oldu ekrana
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }

        }
    }
}
