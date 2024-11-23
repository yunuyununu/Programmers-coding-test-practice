class Solution {
    public int solution(int n) {
       // String three = Integer.toString(n,3);
        StringBuffer three = new StringBuffer(Integer.toString(n,3));
        String reverse = three.reverse().toString();
        int answer = Integer.parseInt(reverse,3);
        return answer;
    }
}