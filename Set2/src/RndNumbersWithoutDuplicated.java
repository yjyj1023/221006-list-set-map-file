public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for(int i = 0; i<50; i++){
            int r = randomNumberGenerator.generate(10); //0~9사이 랜덤한 숫자 50개 출력
            System.out.println(r);
        }
    }
}
