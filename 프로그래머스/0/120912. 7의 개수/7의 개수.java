import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array).replaceAll("[^0-9]","");
        String[] strarr = str.split("");
        for(int i=0;i<strarr.length;i++){
            if(strarr[i].equals("7")){
                answer++;
            }
        }
        return answer;
    }
}