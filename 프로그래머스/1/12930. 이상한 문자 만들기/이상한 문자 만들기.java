class Solution {
    public String solution(String s) {
        String[] str = s.split("",-1);
        int cnt =0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(" ")){
                cnt=0;
                continue;
            }
            if(cnt%2==0){
                str[i]=str[i].toUpperCase();
            }else{
                str[i]=str[i].toLowerCase();
            }
            cnt++;
        }
        String answer = String.join("",str);
        return answer;
    }
}