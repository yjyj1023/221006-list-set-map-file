import java.util.HashMap;

public class MapExercise2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/yjyj1023?tab=repositories";
        //대문자 -> 소문자로 바꾸기
        repoAddr = repoAddr.toLowerCase();

        HashMap<Character, Integer> alphabetCnt = new HashMap<>();

        for(char i = 'a'; i <= 'z'; i++){
            int cnt = 0;
            for(int j = 0; j < repoAddr.length(); j++){
                if(repoAddr.charAt(j) == i){
                    cnt++;
                }
            }
            alphabetCnt.put(i,cnt);

        }

        System.out.println(alphabetCnt);
    }
}
