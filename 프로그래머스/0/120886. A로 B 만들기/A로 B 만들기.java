import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] a = after.split("");
        String[] b = before.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            answer = 1;
        }
        return answer;
    }
}