class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split(" ", -1); // -1로 공백 포함 유지

        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) { // 빈 문자열이 아닌 경우에만 처리
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1).toLowerCase();
            }
            answer.append(str[i]);
            if (i < str.length - 1) { // 단어 사이에만 공백 추가
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}