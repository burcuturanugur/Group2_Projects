package day060;

public class Aslan extends Hayvan implements Runnable{
//illa thread ten extend etmek zorunda değiliz


    public Aslan() {
        //new Thread(this).start();
    }

    public void ilerle(){
        new Thread(this).start();
    }

    @Override
    public void run() { //Runnablenin run metodu
        for (int i = 0; i < 10; i++) {
            System.out.printf("Aslan %d metre ilerledi. \n",(i+1)*10);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }

        }

    }
}
