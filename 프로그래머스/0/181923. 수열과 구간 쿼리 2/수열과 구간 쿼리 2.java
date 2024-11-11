class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if (arr[j] < min && queries[i][2] < arr[j]) {
                    min = arr[j];
                }
            }
            if (min != Integer.MAX_VALUE) {
                answer[i] = min;
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}