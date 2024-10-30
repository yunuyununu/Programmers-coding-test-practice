class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int len = str.length;
        if(len%2==0){
            answer += str[len/2-1];
            answer += str[len/2];
        }else{
            answer += str[len/2];
        }
        return answer;
    }
}