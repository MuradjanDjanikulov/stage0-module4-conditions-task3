package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        int res = number%5;
        int res1 = number%11;
        if (number ==0){
            System.out.println("cannot divide by zero");}
        else{
            if (res == 0 && res1 == 0 && number!=0){
                System.out.println("Dividable");}
            else{
                System.out.println("Non-dividable");

            }}
    }
}