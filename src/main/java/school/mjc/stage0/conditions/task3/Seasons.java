package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month <= 0 || month >13){
            System.out.println("wrong number!");}
        if (month >0 ){
            if (month!=0 && (month <=2 || month==12)  ){
                System.out.println("Winter");}
            if (month>=3 && month <=5){
                System.out.println("Spring");}
            if (month>=6 && month <=8){
                System.out.println("Summer");}
            if (month>=9 && month <=11){
                System.out.println("Autumn");}}
    }
}