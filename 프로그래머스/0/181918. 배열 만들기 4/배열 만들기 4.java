import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // 스택이 비어 있으면 첫 번째 값을 추가
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else {
                // 현재 값이 스택의 마지막 값보다 크면 스택에 추가
                if (stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i]);
                } else {
                    // 현재 값이 작으면 스택에서 마지막 값을 제거
                    while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
                        stk.remove(stk.size() - 1);
                    }
                    stk.add(arr[i]);
                }
            }
        }
        return stk;
    }
}