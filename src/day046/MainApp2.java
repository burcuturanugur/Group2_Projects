package day046;

import java.io.File;

public class MainApp2 {
    public static void main(String[] args) {
        //Text bir klasör mü yoksa dosya mı onu kontrol ediyoruz.
        File file=new File("files/");
        if (file.isFile()){
            System.out.printf("%s bir dosyadır.",file.getName());
        }else if (file.isDirectory()){
            System.out.printf("%s bir klasördür\n",file.getName());
            File[] files = file.listFiles();
            for (File f:files) {
                System.out.println(f.getName());
            }
        }
    }
}
