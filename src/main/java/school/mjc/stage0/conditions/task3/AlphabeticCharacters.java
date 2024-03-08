package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int x = (int) character;
        if ((x <= 122 && x >= 97) || (x <= 90 && x >= 65)){
            if (x == 97 || x == 101 || x == 105 || x == 111 || x == 117 || x == 121 || x == 65 || x == 69 || x == 73 || x == 79 || x == 85 || x == 89){
                System.out.println("Vowel");}
            else {
                System.out.println("Consonant");}
        }
        else {
            System.out.println("wrong alphabet!");
        }
    }
}