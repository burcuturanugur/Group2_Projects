package day022;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        for(initialize;condition;incremental statement){
        }


        while (condition){ while ve for pre testtir yani önce test eder sonra çalışır
        statement(s);
        }

        do{ do while post testtir önce çalışır sonra test eder
        statement(s);
        } while(condition);

        */

        int counter=0;
        while (counter<5){//geriye true ya da false döndürmesi gerken bir expression yazıyoruz içine
// counter 5ten küçük olduğu sürece çalıştır demiş oluyoruz.
            System.out.println(counter);
            counter++;
        }


    }
}
