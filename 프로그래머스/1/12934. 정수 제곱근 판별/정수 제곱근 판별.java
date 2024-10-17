class Solution {
    public long solution(long n) {
        long answer = -1;
        long a=1;
        while(n>=a){
            if(a*a==n){
                answer = (a+1)*(a+1);
                break;
            }else{
                a++;
            }
        }
        return answer;
    }
}