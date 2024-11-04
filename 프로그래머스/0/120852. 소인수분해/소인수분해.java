import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {
        ArrayList answer = new ArrayList<>();

        for(int i=2; i<=n; i++) {
            while(n % i == 0) {
                if(!answer.contains(i)){
                    answer.add(i);
                }
                n /= i;
            }
        }
        return answer;
    }
}