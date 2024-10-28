class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 0;
        
        for(int i=1;i<=10;i++){
            answer *= i;
            if(answer==n){
                num = i;
                break;
            }else if(answer>n){
                num = i-1;
                break;
            }
        }
        return num;
    }
}