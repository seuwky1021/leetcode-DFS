package 接口继承多态;

class Square extends Quadrangle2 {
    public Square(){
        System.out.println("正方形");
    }
}

class Parallelogramgle extends Quadrangle2 {
    public Parallelogramgle(){
        System.out.println("平行四边形");
    }
}


public class Quadrangle2 {
    private Quadrangle2[] qtest=new Quadrangle2[6];
    private int nextindex=0;
    public void draw(Quadrangle2 q){
        if(nextindex<qtest.length){
            qtest[nextindex]=q;
            System.out.println(nextindex);
            nextindex++;
        }
    }

    public static void main(String[] args){
        Quadrangle2 q=new Quadrangle2();
        q.draw(new Square());
        q.draw(new Parallelogramgle());
    }
}

