class Solution {
    public int solution(int[] array, int n) {
        int result = array[0];
        int min = n; // 값의 차이
        for(int i=0;i<array.length;i++){
            int num = Math.abs(n-array[i]);
            if(num<min){
                result = array[i];
                min = num;
            }else if(num == min && array[i]<result){
                result = array[i];
            }
        }
        return result;
    }
}