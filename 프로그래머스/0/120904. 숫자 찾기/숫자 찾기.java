class Solution {
    public int solution(int num, int k) {
        String n = Integer.toString(num);
        String kn = Integer.toString(k);
        int answer = n.indexOf(kn);
        if(answer != -1){
            answer++;
        }
        return answer;
    }
}