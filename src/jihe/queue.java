package jihe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(3);
        s.push(8);
        s.push(1);
        Iterator<Integer> i=s.iterator();
        while(i.hasNext()) {
            int a=i.next();
            System.out.println(a);
        }
        System.out.println(s.peek());


        Queue<Integer> q=new LinkedList<>();
        q.offer(6);
        q.offer(7);
        q.offer(8);
        Iterator<Integer> it=q.iterator();
        while(it.hasNext()) {
            int at=it.next();
            System.out.println(at);
        }




    }
}
