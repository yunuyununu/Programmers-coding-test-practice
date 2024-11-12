class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        for(int i=1;i<str.length;i++){
            int m = Integer.parseInt(str[i]);
            if(min>m){
                min = m;
            }
            if(max<m){
                max = m;
            }
        }
        return min+" "+max;
    }
}