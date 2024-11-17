public class Solution {
    boolean solution(String s) {
        // 열려 있는 괄호의 개수를 세기 위한 카운터
        int count = 0;

        // 문자열 순회
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++; // 여는 괄호가 나오면 카운터 증가
            } else if (c == ')') {
                count--; // 닫는 괄호가 나오면 카운터 감소
                
                // 카운터가 음수가 되면 올바르지 않은 괄호 문자열
                if (count < 0) {
                    return false;
                }
            }
        }

        // 최종적으로 카운터가 0이면 올바른 괄호 문자열
        return count == 0;
    }
}
