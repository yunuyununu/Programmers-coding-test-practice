import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String[] a = my_string.toLowerCase().split("");
        Arrays.sort(a);
        String answer = String.join("",a);
        return answer;
    }
}