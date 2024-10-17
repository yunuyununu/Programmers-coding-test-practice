class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a=0;
        String[] str = String.valueOf(x).split(""); 
        for(int i=0;i<str.length;i++){
            a += Integer.parseInt(str[i]);
        }
        if(x%a!=0){
            answer = false;
        }
        return answer;
    }
}