import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("x+","x").split("x");
        answer = Arrays.stream(answer)
                       .filter(s -> !s.isEmpty())
                       .toArray(String[]::new);
        
        Arrays.sort(answer);
        
        return answer;
    }
}