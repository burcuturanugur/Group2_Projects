package day025.obs;

public class student {
    public String firstName;
    public String lastName;
    public int age;
    public int[] grades;



    public void showInfo(){
        System.out.printf( "%s %s [%d - %5.2f]",firstName,lastName,age,getGpa());
    }
    public double getGpa(){
        int sum=0;
        for (int i = 0; i < grades.length; i++) {
            sum+=grades[i];

        }
        double avg=sum/grades.length;
        return avg;
    }

    public static void main(String[] args) {
        student st1=new student();
        student st2=new student();

        st1.firstName="Ahmet";
        st1.lastName="Memiş";
        st1.age=17;
        st1.grades=new int[]{70,80};

        st2.firstName="Şengül";
        st2.lastName="Dilek";
        st2.age=15;
        st2.grades=new int[]{82,76};

        if (st1.getGpa()> st2.getGpa()){
            st1.showInfo();
        }else {
            st2.showInfo();
        }
    }

}
