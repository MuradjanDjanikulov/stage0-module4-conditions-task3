package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        int x = (int) symbol;
        if ((x <= 122 && x >= 97) || (x <= 90 && x >= 65)){
            System.out.println("English");}
        else{
            System.out.println("Non English");}
    }
}