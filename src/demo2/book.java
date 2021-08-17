package demo2;

public class book {
    static int id=11;

    private String name;

    public book(){}

    public String getName(){
        int id=0;
        //setName("java");
        return id+this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public book getBook(){
        return this;
    }

    public static void main(String[] args){
        book bb=new book();
        book bb2=new book();
        bb2.id=12;
        System.out.println(bb.id);

        bb.setName("javaaaa");
        String b=bb.getName();
        System.out.println(b);
    }
}
