package 接口继承多态;

interface drawTest{
    //定义接口
    public void draw();
}

class ParallelogramgleUseInterface extends QuadrangleInterface
implements drawTest{
    public void draw() {//由于该类实现了接口，所以需要覆盖draw()方法
        System.out.println("平行四边形.draw()");
    }

    public void doAnyThing(){
        //some sentence   //覆盖父类方法
    }
}

class SquareUseInterface extends QuadrangleInterface implements
        drawTest{
    public void draw(){
        System.out.println("正方形.draw()");
    }
    public void doAnyThing(){
        //some sentence   //覆盖父类方法
    }
}

class AnyThingUseInterface extends QuadrangleInterface{
    public void doAnyThing(){

    }
}

public class QuadrangleInterface {
    public void doAnyThing(){
        //some sentence
    }

    public static void main(String[] args){
        drawTest[] d={
                new SquareUseInterface(),new ParallelogramgleUseInterface()
        };
        for(int i =0;i<d.length;i++){
            d[i].draw();
        }
    }
}
