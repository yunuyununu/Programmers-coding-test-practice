class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] part = binomial.split(" ");
        
        int a = Integer.parseInt(part[0]);
        String op = part[1];
        int b = Integer.parseInt(part[2]);
        
        if(op.equals("+")){
            answer = a + b;
        }else if(op.equals("-")){
            answer = a - b;
        }else if(op.equals("*")){
            answer = a * b;
        }
        return answer;
    }
}