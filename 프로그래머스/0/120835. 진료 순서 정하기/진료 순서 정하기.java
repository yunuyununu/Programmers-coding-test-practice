class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0;i<emergency.length;i++){
            int cnt =0; //돌 때마다 0으로 초기화
            for(int j=0;j<emergency.length;j++){
                if(emergency[i]<emergency[j]){
                    cnt++;
                }
            }
            answer[i] = cnt +1; //현재값의 순위를 저장
        }
        return answer;
    }
}