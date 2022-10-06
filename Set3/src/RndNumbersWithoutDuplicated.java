import java.util.HashMap;
import java.util.HashSet;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i<50; i++){
            int r = randomNumberGenerator.generate(10); //0~9사이 랜덤한 숫자 50개 출력
            numbers.add(r);

        }
        System.out.println(numbers);
        System.out.println("개수:"+numbers.size());
    }
}
