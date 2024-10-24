class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int cnt = 0;
        for(int i=0;i<intStrs.length;i++){
            if(Integer.parseInt(intStrs[i].substring(s,s+l))>k){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int a =0;
        for(int j=0;j<intStrs.length;j++){
            if(Integer.parseInt(intStrs[j].substring(s,s+l))>k){
                answer[a++] = Integer.parseInt(intStrs[j].substring(s,s+l));
            }
        }
        return answer;
    }
}