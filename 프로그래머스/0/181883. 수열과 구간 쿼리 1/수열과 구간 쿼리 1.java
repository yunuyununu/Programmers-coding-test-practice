class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            // 각 쿼리의 범위에 해당하는 인덱스에 대해 증가
            for (int j = start; j <= end; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}