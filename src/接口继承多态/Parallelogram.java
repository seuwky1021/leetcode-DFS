package 接口继承多态;

class Quadrangle{
    public static void draw(Quadrangle q){
        //some sentence
    }
}


public class Parallelogram extends Quadrangle {
    public static void main(String[] args){
        Test t3=new Test();
        Parallelogram p=new Parallelogram();
        draw(p);
    }
}

