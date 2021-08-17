package jihe;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
       Set<Integer> hash=new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(1);
        Iterator<Integer> it=hash.iterator();
        while(it.hasNext()){
            int a=it.next();
            System.out.println(a);
        }
    }
}
