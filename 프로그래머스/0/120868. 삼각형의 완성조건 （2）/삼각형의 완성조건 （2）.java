class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = max - min; i < max; i++) {
            answer++;
        }
        for (int i = max + min - 1; i > max; i--) {
            answer++;
        }
        return answer;
    }
}