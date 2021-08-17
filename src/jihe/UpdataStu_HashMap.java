package jihe;

import java.util.*;

public class UpdataStu_HashMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("01","李同学");
        map.put("02","位同学");
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        System.out.println("Key集合中的元素：");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection<String> coll=map.values();
        it=coll.iterator();
        System.out.println("values集合中的元素:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }



}
