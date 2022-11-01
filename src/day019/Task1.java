package day019;

public class Task1 {
    public static void main(String[] args) {
       /* Store grades of twelve students in an integer array variable. Write a Java program that finds the average of
        these grades.
        grades: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45
        average?*/

        double sum=0;
        double average=0;
       int [] grades={56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        for (int i = 0; i <grades.length ; i++) {
            sum=sum+(grades[i]);
            }
        average=sum/grades.length;
        System.out.println("AVERAGE");
        System.out.printf("%5.2f\t",average );
        }
    }

