class Solution {
    public String solution(String my_string, int s, int e) {
        String[] str = my_string.split("");
        for(int i=0;i<e-s+1;i++){
            str[e-i] = String.valueOf(my_string.charAt(s+i));
        }
        String answer = String.join("",str);
        return answer;
    }
}