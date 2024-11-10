import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        
        BigInteger sum = big1.add(big2);
        String answer = sum.toString();
        return answer;
    }
}