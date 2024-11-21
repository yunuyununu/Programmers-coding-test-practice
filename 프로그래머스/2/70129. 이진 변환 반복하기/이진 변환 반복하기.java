class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String x = s;
        int xl = x.length();
        String binary = "";
        int cnt = 0;
        int xnum = 0;
        while(!x.equals("1")){
            int lengthBefore = x.length();
            x = x.replace("0","");
            int lengthAfter = x.length();
            
            xnum += lengthBefore-lengthAfter;
            x = Integer.toBinaryString(lengthAfter);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = xnum;
        
        return answer;
    }
}