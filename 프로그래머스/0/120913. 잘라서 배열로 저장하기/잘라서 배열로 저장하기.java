class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length() / n + (my_str.length() % n == 0 ? 0 : 1);
        String[] answer = new String[size];
        int num = 0;
        // 문자열을 n 길이씩 잘라서 배열에 저장
        for (int i = 0; i < my_str.length(); i += n) {
            // i부터 i+n까지 잘라서 저장
            answer[num++] = my_str.substring(i, Math.min(i + n, my_str.length()));
        }
        return answer;
    }
}