class Solution {
    public int solution(String number) {
        int answer=0;
        for(int i=0;i<number.length();i++){
            answer += number.charAt(i)-'0'; //정수형으로 바꾸기위해
        }
        answer = answer%9;
        return answer;
    }
}