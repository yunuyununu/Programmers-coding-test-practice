import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String[] arr = Arrays.stream(my_string.split("")).distinct().toArray(String[]::new);
        String answer = String.join("",arr);
        return answer;
    }
}