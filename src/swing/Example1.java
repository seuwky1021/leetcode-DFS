package swing;

import javax.swing.*;
import java.awt.*;
public class Example1 extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);
        Container container=jf.getContentPane();//获取一个容器
        JLabel jl=new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.GREEN);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Example1 ex=new Example1();
        ex.CreateJFrame("创建一个JFrame窗体");
        //new Example1().CreateJFrame("创建一个JFrame窗体")
    }
}
