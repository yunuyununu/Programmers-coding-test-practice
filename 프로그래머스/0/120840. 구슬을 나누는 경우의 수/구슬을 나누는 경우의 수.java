import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger b = BigInteger.ONE; // 1을 BigInteger로 초기화
        BigInteger s = BigInteger.ONE; // 1을 BigInteger로 초기화
        
        // balls! / (balls - share)!
        for (int i = balls - share + 1; i <= balls; i++) {
            b = b.multiply(BigInteger.valueOf(i)); // i를 BigInteger로 변환 후 곱셈
        }
        
        // share!
        for (int i = 1; i <= share; i++) {
            s = s.multiply(BigInteger.valueOf(i)); // i를 BigInteger로 변환 후 곱셈
        }
        
        // C(balls, share) = balls! / (share! * (balls - share)!)
        BigInteger result = b.divide(s); // 나누기 연산
        return result.intValue(); // 결과를 int로 변환하여 반환
    }
}
