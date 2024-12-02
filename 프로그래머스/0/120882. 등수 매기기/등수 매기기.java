class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        int[] rank = new int[answer.length];
        // 평균구하기
        for(int i=0;i<answer.length;i++){
            answer[i] = (score[i][0]+score[i][1])/2.0;
        }
        
        for(int j=0;j<rank.length;j++){
            rank[j] =1;
            for(int k=0;k<answer.length;k++){
                if(answer[j]<answer[k]){ 
                    rank[j]++;               
                }
            }
        }
        return rank;
    }
}