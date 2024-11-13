import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] array = Arrays.stream(arr).distinct().toArray();  
        int len = array.length;
        int[] answer = new int[k];
        for(int i=0;i<answer.length;i++) {
            if(len != 0) {
                len--;
                answer[i] = array[i];
            }else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
