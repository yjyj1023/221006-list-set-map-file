import java.util.HashSet;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();

        HashSet<Character> alphabet = new HashSet<Character>();


        for(int i = 0; i<50; i++){
            int r = randomAlphabetGenerator.generate(26);
            int a = 'A'+r;
            alphabet.add((char)a);
        }

        System.out.println(alphabet);
        System.out.println("개수:"+alphabet.size());
    }
}
