import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        while(n>1){
            if(n%2==0){
                answer.add(n);
                n = n/2;
            }else if(n%2!=0){
                answer.add(n);
                n = 3*n+1;
            }
        }
        answer.add(1);
        return answer;
    }
}