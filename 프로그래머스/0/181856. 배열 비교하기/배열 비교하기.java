class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a1 = 0;
        int a2 = 0;
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length?1:-1;
        }else{
            for(int num : arr1){
                a1 += num;
            }
            for(int num : arr2){
                a2 += num;
            }
            if(a1==a2){
                answer = 0;
            }else{
                answer = a1>a2?1:-1;
            }
            
        }
        
        return answer;
    }
}