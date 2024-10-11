class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length/5+(names.length%5==0?0:1)];
        int a=0;
        for(int i=0;i<names.length;i++){
            if(i==0||i%5==0){
                answer[a] = names[i];
                a++;
            }
        }
        return answer;
    }
}