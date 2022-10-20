package day012;

public class LogicalOperators {
    public static void main(String[] args) {
        /*Mantıksal Operatörler
        & (ampersant)  : ve (and) operatörü
        | (pipe)  : veya (or) operatörü
        ^ : xor
        ! : Değil

       and operatörü:
       true & true : true
       true & false : false
       false & true : false
       false & false : false

       veya | operatörü
       true | true : true
       true | false : true
       false | true : true
       false | false : false

       xor ^ operatörü
       true ^ true : false
       true ^ false : true
       false ^ true : true
       false ^ false : false

       not veya değil ! operatörü
       !true  : false
       !false : true
*/
        int yas=40;
        if (!(yas<18 | yas>=60) ){
            System.out.println("Hediye verilecektir.");
        }else{
            System.out.println("Hediye verilmeyecektir.");
        }





    }
}
