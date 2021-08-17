package leetcode;

import java.util.*;

class NQUEEN51 {
    List<List<String>> l=new ArrayList<>();
    static List<List<String>> q=new ArrayList<>();

    public static void main(String[] args) {
        int num=1;
        System.out.println("Please enter the numbers of Queens:");
        Scanner s=new Scanner(System.in);
        int QueenNum=s.nextInt();
        NQUEEN51 n=new NQUEEN51();
        q=n.solveNQueens(QueenNum);
//        System.out.println(q);
        Iterator<List<String>> it=q.iterator();
        while(it.hasNext()){
            List<String> b=it.next();
//            System.out.println(it.next());
            Iterator<String> i=b.iterator();
            while(i.hasNext()){
                System.out.println(i.next());
            }
            System.out.println("第"+num+"种情况7");
            num++;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[] a=new int[n];
        nQueen(a,0,n);
        return l;
    }

    public int check(int[] a,int j,int k){
        //check如果是0代表不能放在这里，如果是1则说明这个位置可以放。
        int t=1;
        for(int i=0;i<j;i++){
            if(a[i]==k){
                t=0;
                break;
            }
            if(Math.abs(i - j) == Math.abs(a[i] - k)){/*检测斜线是否成立斜线*/
                t = 0;
                break;
            }
        }
        return t;
    }

    public List<String> print(int[] a,int n){
        //记录一组成功的值，将数组转化为list
        List<String> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] row=new char[n];
            Arrays.fill(row,'.');
            row[a[i]]='Q';
            ll.add(new String(row));
        }
        return ll;
    }

    public void nQueen(int[] a,int k,int n){
        //开始递归
        if(k>n-1)l.add(print(a,n));
        else
        {
            for (int j = 0; j <= n - 1; j++)
            {
                if (check(a, k, j)==1)
                //如果这一行满足情况了，就转到下一行去找，k每次+1代表行数+1
                {
                    a[k] = j;
                    nQueen(a, k + 1, n);
                }
            }
        }
    }
}