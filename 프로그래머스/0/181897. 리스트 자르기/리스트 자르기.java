import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1]+1;
        if(n==1){
            a=0;
        }else if(n==2){
            b=num_list.length;
        }else if(n==4){
            int num = 0;
            int[] ans = new int[Arrays.copyOfRange(num_list,slicer[0],slicer[1]).length/slicer[2]+1];
            for(int i=slicer[0];i<=slicer[1];i +=slicer[2]){
                ans[num]=num_list[i];
                num++;
            }
            return ans;
        }
        int[] answer = Arrays.copyOfRange(num_list,a,b);
        return answer;
    }
}