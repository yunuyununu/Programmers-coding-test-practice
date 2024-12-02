class Solution {
    public int solution(int[][] sizes) {
        int width=0;
        int length=0;
        for(int i=0;i<sizes.length;i++){
            // 두 변 중 더 긴 것 => 가로
            // 더 짧은 것 => 세로
            int w=Math.max(sizes[i][0],sizes[i][1]);
            int l=Math.min(sizes[i][0],sizes[i][1]);
            width=Math.max(width,w);
            length=Math.max(length,l);
        }
        return width*length;
    }
}
