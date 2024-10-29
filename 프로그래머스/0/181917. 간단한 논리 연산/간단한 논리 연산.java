class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean onetwo = true;
        boolean thrfo = true;
        if(x1==false&&x2==false){
            onetwo = false;
        }
        if(x3==false&&x4==false){
            thrfo = false;
        }
        if(onetwo==true&&thrfo==true){
            answer = true;
        }
        return answer;
    }
}