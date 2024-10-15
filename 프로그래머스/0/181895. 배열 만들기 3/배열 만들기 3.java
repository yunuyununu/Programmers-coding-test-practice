import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=intervals[0][0];i<=intervals[0][1];i++){
            list.add(arr[i]);
        }
        for(int i=intervals[1][0];i<=intervals[1][1];i++){
            list.add(arr[i]);
        }
        
        return list;
    }
}