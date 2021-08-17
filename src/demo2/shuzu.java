package demo2;

import java.util.Arrays;

public class shuzu {
    public static void main(String[] args){
        //int sz[]=new int[12];
        int sz[]={2,66,4,8,1};

        int szz[]=new int[]{1,2,3,4,5,6,7,8,9};

        //double erweishuzu[][]=new double[3][4];
        double erweishuzu[][]={{3,4.3},{4.55,7.88},{4,3}};

        Arrays.sort(sz);//排序
        int newarr[]=Arrays.copyOf(sz,5);

        int index=Arrays.binarySearch(newarr,0,4,4);

        for(int i=0;i<5;i++)
        {
            System.out.println(newarr[i]);
        }
        for(int i=0;i<9;i++)
        {
            System.out.println(szz[i]);
        }
        System.out.println("4的位置在"+index);
    }
}
