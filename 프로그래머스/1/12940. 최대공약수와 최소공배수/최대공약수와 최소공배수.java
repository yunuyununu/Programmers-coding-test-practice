class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        //최대공약수
        int gcd = n;
        int temp = m;
        while(temp !=0){
            int remainder = gcd % temp;
            gcd = temp;
            temp = remainder;
        }
        answer[0] = gcd;
        
        //최소공배수 (LCM공식 사용)
        int lcm = (n*m)/answer[0];
        answer[1] = lcm;
        
        return answer;
    }
}