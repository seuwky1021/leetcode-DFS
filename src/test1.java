
import java.util.Scanner;

public class test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++) {
            long a=sc.nextLong();
            System.out.println((a-1)%9+1);
        }
    }
}
//小雅米在隔离时非常无聊，于是他打起了数字的主意。小雅米选择了一个正整数 n(1 \leq n \leq 10^{18})n(1≤n≤10
//18
// ) 。每一次他都会将 nn 变为 nn 每一位数字的和。例如我们对 123123 的每一位数字求和得到 1+2+3=61+2+3=6 。小雅米发现进行很多次求和后，这个结果将不再改变。由于小雅米耐心有限，请你帮助他算出最后的答案。