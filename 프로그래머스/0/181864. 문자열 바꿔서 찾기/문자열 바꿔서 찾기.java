class Solution {
    public int solution(String myString, String pat) {
        String my ="";
        int answer = 0;
        for(int i=0;i<myString.length();i++){
            if(String.valueOf(myString.charAt(i)).equals("A")){
                my += "B";
            }else{
                my += "A";
            }
        }
        System.out.print(my);
        if(my.contains(pat)==true){
            answer = 1;
        }
        return answer;
    }
}