class Solution {
    public int solution(int order) {
        String answer = String.valueOf(order).replace("3","-").replace("6","-").replace("9","-").replaceAll("[0-9]","");
        return answer.length();
    }
}