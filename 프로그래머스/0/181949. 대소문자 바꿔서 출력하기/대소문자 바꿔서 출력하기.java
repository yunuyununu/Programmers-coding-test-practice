import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        for(int i=0;i<a.length;i++){
            if(a[i].matches("[a-z]")){
                a[i] = a[i].toUpperCase();
            }else{
                a[i] = a[i].toLowerCase();
            }
        }
        String str = String.join("",a);
        System.out.print(str);
    }
}