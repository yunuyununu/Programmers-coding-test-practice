import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public long solution(long n) {
        String answer = "";
        String[] N = String.valueOf(n).split("");
        Arrays.sort(N, Comparator.reverseOrder());
        for(int i=0;i<N.length;i++){
            answer += Long.parseLong(N[i]);
        }
        return Long.parseLong(answer);
    }
}