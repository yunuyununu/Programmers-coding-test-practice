class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0;i<my_string.length();i++){
            char alp = my_string.charAt(i);
            if(alp>='A'&&alp<='Z'){
                answer[alp-'A']++;
            }else{
                answer[alp-'A'-6]++;
            }
        }
        return answer;
    }
}