package 接口继承多态;

public class Test {
    public Test(){
        //somesentence
    }

    protected void doSomething(){
        //somesentence
    }

    protected Test doit(){
        return new Test();
    }

    static class Test2 extends Test{//继承父类
        Test2(){
            super();//调用父类的构造方法
            super.doSomething();
            System.out.println("调用父类构造方法");
        }

        public void doSomethingnew(){
            //新增方法
            //somesentence
        }

        public void doSomething(){
            //somenewsentence
        }

        protected Test2 dolt(){
            return new Test2();
        }
    }

    public static void main(String[] args){
        Test2 t=new Test2();
        Test t2=new Test();
        t2.doSomething();
    }
}
