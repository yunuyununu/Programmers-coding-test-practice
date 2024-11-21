import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] temp = new int[rank.length];
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                temp[i] = rank[i];
            }else{
                temp[i]=101;
            }
        }
        Arrays.sort(temp);
        for(int j=0;j<rank.length;j++){
            if(rank[j]==temp[0]){
                answer += j*10000;
            }else if(rank[j]==temp[1]){
                answer += j*100;
            }else if(rank[j]==temp[2]){
                answer += j;
            }
        }
        return answer;
    }
}