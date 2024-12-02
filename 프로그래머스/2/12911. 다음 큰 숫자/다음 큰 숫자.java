class Solution {
    public int solution(int n) {
        int onenum = 0;
        int answer = n;
        String nBinary = Integer.toBinaryString(n);
        for(int i=0;i<nBinary.length();i++){
            if(nBinary.charAt(i)=='1'){
                onenum++;
            }
        }
        while(answer != 0){
            answer++;
            String binary = Integer.toBinaryString(answer);
            int anum =0;
            for(int i=0;i<binary.length();i++){
                if(binary.charAt(i)=='1'){
                    anum++;
                }
            }
            if(anum == onenum){
                break;
            }   
        }
        return answer;
    }
}