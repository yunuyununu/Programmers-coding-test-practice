class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0;i<order.length;i++){
            if(order[i].contains("americano")||order[i].matches("anything")){
                answer += 4500;
            }else if(order[i].contains("cafelatte")){
                answer += 5000;
            }
        }
        return answer;
    }
}