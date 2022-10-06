import java.util.HashMap;
import java.util.Map;

public class MapExercise3 {
    public boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') | (ch >= 'a' && ch <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        MapExercise3 mapExercise3 = new MapExercise3();

        String repoAddr = "Https://Github.com/yjyj1023?Tab=repositories";

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for (char c = 'A'; c < 'Z'; c++) {
            alphabetCnt.put(c, 0);
        }

        for (int i = 0; i < repoAddr.length(); i++) {
            char c = repoAddr.charAt(i);
            boolean isAlphabet = mapExercise3.isAlphabet(c);
            if (isAlphabet) {
                alphabetCnt.put(c, alphabetCnt.get(c) + 1);
            }
        }

        System.out.println(alphabetCnt);
    }
}