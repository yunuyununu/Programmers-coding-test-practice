class Solution {
    public int[] solution(int[] arr) {
        // 1. 초기 n 값 설정: 배열의 길이보다 큰 2의제곱수를 찾기위한 변수
        int n = 1;
        
        // 2. 배열의 길이보다 크거나 같은 가장 작은 2의 제곱수를 찾는 과정
        // 배열의 길이보다 작은 동안 n을 2배
        while (arr.length > n) {
            n *= 2;
        }
        
        // 3. 결과 배열 생성: 크기가 n인 배열을 생성. 초기값은 모두 0
        int[] result = new int[n];
        
        // 4. 기존 배열의 값을 결과 배열에 복사
        // arr의 값을 차례로 result에 복사
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}