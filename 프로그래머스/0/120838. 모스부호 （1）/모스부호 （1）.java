import java.util.Arrays;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] lett = letter.split(" ");
        String[] alp = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<lett.length;i++){
            answer += alp[Arrays.asList(mos).indexOf(lett[i])];
        }
        return answer;
    }
}