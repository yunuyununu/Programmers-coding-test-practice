class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] max = {dots[0][0],dots[0][1]};
        int[] min = {dots[0][0],dots[0][1]};
        for(int i=1;i<dots.length;i++){
            if(dots[i][0]+dots[i][1]>max[0]+max[1]){
                max[0] = dots[i][0];
                max[1] = dots[i][1];
            }
            if(dots[i][0]+dots[i][1]<min[0]+min[1]){
                min[0] = dots[i][0];
                min[1] = dots[i][1];
            }        
        }
        answer = (max[0]-min[0])*(max[1]-min[1]);
        return answer;
    }
}