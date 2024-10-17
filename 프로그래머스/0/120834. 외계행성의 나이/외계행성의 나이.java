class Solution {
    public String solution(int age) {
        String answer ="";
        String[] ag = Integer.toString(age).split("");
        String[] alp = {"a","b","c","d","e","f","g","h","i","j"};
        for(int i=0;i<ag.length;i++){
            answer += alp[Integer.parseInt(ag[i])];
        }
        return answer;
    }
}