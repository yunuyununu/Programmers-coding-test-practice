class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%2==0){
                answer += i%2==0?i*i:0;
            }else{
                answer += i%2==0?0:i;
            }
        }
        return answer;
    }
}