package jihe;

import java.util.ArrayList;
import java.util.List;

public class Gather {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i=(int)(Math.random()*list.size());
        System.out.println("随机获取数组中的元素"+list.get(i));
        list.remove(2);
        System.out.println("将索引为2的元素移除后剩下的数据是");
        for (int j = 0; j <list.size(); j++) {
            System.out.print(list.get(j)+" ");
        }
    }
}
