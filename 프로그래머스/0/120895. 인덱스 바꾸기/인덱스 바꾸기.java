class Solution {
    public String solution(String my_string, int num1, int num2) {
        char n1 = my_string.charAt(num1);
        char n2 = my_string.charAt(num2);
        char[] arr = my_string.toCharArray();
        arr[num1] = n2;
        arr[num2] = n1;
        
        return String.valueOf(arr);
    }
}