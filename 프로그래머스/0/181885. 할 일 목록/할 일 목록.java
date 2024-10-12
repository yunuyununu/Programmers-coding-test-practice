import java.util.ArrayList;
class Solution {
    public ArrayList solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0;i<todo_list.length;i++){
            for(int j=0;j<finished.length;j++){
                if(finished[i]==false){
                    answer.add(todo_list[i]);
                }
                break;
            }
        }
        return answer;
    }
}