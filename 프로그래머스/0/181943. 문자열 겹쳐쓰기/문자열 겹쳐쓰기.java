class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] str = my_string.split("");
        String[] ovr = overwrite_string.split("");
        int num=0;
        for(int i=s;i<ovr.length+s;i++){
            str[i] = ovr[num++];
        }
        return String.join("",str);
    }
}