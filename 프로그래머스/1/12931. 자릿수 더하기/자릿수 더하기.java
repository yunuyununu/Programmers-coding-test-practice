import java.util.*;

public class Solution {
    public int solution(int n) {
        String[] N = Integer.toString(n).split("");
        int answer = 0;
        for(int i=0;i<N.length;i++){
            answer += Integer.parseInt(N[i]);
        }

        return answer;
    }
}