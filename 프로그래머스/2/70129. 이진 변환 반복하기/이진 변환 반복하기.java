class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String x = s;
        int xl = x.length();
        String binary = "";
        int num = 0;
        int xnum = 0;
        while(x.length()!=1){
            x = x.replace("0","");
            xnum += xl-x.length();
            binary = Integer.toBinaryString(x.length());
            x = binary;
            xl = x.length();
            num++;
        }
        answer[0] = num;
        answer[1] = xnum;
        
        return answer;
    }
}