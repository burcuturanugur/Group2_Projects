package day014;

public class Task {
    public static void main(String[] args) {
        int n1=4;
        int n2=8;
        int n3=1;

        int min=n1;
        if (min>n2){
            min=n2;
        }
        if (min>n3){
            min=n3;
        }

        System.out.println(min);
    }
}
