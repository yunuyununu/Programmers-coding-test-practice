class Solution {
    public int[] solution(String myString) {
        String[] answer1 = myString.split("x",-1);
        int[] answer2 = new int[answer1.length];
        for(int i=0;i<answer1.length;i++){
            answer2[i] = answer1[i].length();
        }
        return answer2;
    }
}