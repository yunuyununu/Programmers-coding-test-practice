import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] str = my_string.split("");
        for(int i=0;i<queries.length;i++){
            int num = 0;
            String[] temp = Arrays.copyOfRange(str,queries[i][0],queries[i][1]+1);
            for(int j=queries[i][1];j>=queries[i][0];j--){
                str[j] = temp[num++];
            }
        }
        String answer = String.join("",str);
        return answer;
    }
}