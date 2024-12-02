class Solution {
    public int solution(int n) {
        int onenum = Integer.bitCount(n);
        int answer = n;

        while(answer != 0){
            answer++;
            int anum =Integer.bitCount(answer);
            if(anum == onenum){
                break;
            }   
        }
        return answer;
    }
}