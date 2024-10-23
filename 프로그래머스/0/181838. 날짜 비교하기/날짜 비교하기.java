class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String date01 = "";
        String date02 = "";
        for(int i=0;i<date1.length;i++){
            date01 += String.valueOf(date1[i]);
            date02 += String.valueOf(date2[i]);
        }
        if(Integer.parseInt(date01)<Integer.parseInt(date02)){
            answer = 1;
        }
        return answer;
    }
}