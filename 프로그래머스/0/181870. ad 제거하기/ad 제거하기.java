import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].contains("ad")==false){
                list.add(strArr[i]);
            }
        }
        
        return list;
    }
}