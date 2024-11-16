class Solution {
    public String[] solution(String[] picture, int k) {
        String[] temp = new String[picture.length];
        for(int i=0;i<temp.length;i++){
            String str = "";
            for(int j=0;j<picture[i].length();j++){
                for(int l=1;l<=k;l++){
                    str += picture[i].charAt(j);
                }
            }
            temp[i] = str;
        }
        String[] answer = new String[picture.length*k];
        int num = 0;
        for(int i=0;i<temp.length;i++){
            for(int j=1;j<=k;j++){
                answer[num++] = temp[i];
            }
        }
        return answer;
    }
}
