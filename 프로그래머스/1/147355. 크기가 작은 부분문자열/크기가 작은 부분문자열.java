class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0;i<t.length()-p.length()+1;i++){
            String tt = t.substring(i,i+p.length());
            if (tt.compareTo(p) <= 0) { // 문자열 비교
                answer++;
            }
        }
        return answer;
    }
}