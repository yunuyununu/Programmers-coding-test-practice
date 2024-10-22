class Solution {
    public int solution(int i, int j, int k) {
        String word = "";
        int cnt = 0;
        for(int a=i;a<=j;a++){
            word += String.valueOf(a);
        }
        String[] list = word.split("");
        for(int n=0;n<list.length;n++){
            if(list[n].equals(String.valueOf(k))){
                cnt++;
            }
        }
        return cnt;
    }
}