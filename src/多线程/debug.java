package 多线程;

public class debug {
    public static void logging(){
        System.out.println("记录日志...");
    }

    public static void main(String[] args) {
        //创建线程,下面有两个线程 一个是main这个线程，一个是thread这个线程

        Thread thread=new Thread(()->logging());
        thread.start();

        logging();
    }
}