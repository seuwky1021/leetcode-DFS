package demo2;

public class math {
    public static int GetEvenNum(double num1,double num2){
        int s=(int)num1+(int)(Math.random()*(num2-num1));
        if(s%2==0){
            return s;
        }
        else{
            return s+1;
        }
    }


    public static void main(String[] args){
        System.out.println("90度的正弦值"+Math.sin(Math.PI/2));
        System.out.println("e的平方值"+Math.exp(2));
        System.out.println("输出一个2~32之间的偶数:  "+GetEvenNum(2,32));
    }
}
