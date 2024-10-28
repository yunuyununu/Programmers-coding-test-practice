class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int patLength = pat.length(); 
        int myStringLength = myString.length();
        //끝에서 부터 접미사 확인 후 맞으면 break로 나온뒤 출력.
        for (int i = myStringLength - 1; i >= 0; i--) {
            String substr = myString.substring(0, i + 1);
            if (substr.endsWith(pat)) {
                answer = substr;
                break;
            }
        }

        return answer;
    }
}