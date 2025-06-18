import java.util.ArrayDeque;

class Solution
{
    public int solution(String s)
    {
        ArrayDeque<Character> arr = new ArrayDeque<>();
            
        if(s.length() == 1) return 0;
        arr.addLast(s.charAt(0));
        for(int i = 1 ; i < s.length() ; i++){
            if(!arr.isEmpty() && arr.peekLast() == s.charAt(i)) arr.pollLast();
            else arr.addLast(s.charAt(i));
        }
        
        return arr.isEmpty() ? 1 : 0 ;

    }
}