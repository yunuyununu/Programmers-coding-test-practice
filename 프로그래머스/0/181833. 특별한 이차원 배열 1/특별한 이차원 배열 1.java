class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int a = 0;
        while(a!=n){
            answer[a][a] =1;
            a++;
        }
        return answer;
    }
}