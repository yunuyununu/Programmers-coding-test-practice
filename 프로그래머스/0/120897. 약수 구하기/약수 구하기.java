class Solution {
    public int[] solution(int n) {
        int cnt =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        int[] answer = new int[cnt]; //배열길이
        int a = 0;
        for(int j=1;j<=n;j++){
            if(n%j==0){
                answer[a] = j;
                a++;
            }
        }
        return answer;
    }
}