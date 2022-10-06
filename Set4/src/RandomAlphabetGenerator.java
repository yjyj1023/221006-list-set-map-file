public class RandomAlphabetGenerator implements alphabetGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
