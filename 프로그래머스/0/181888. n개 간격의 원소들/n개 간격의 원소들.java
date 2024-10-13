class Solution {
    public int[] solution(int[] num_list, int n) {
        int l = num_list.length;
        int[] answer = new int[l/n+(l%n==0?0:1)];
        int a = 0;
        for(int i=0;i<num_list.length;i++){
            if(i==0||i%n==0){
                answer[a++] = num_list[i];
            }
        }
        return answer;
    }
}