import java.io.*;
import java.util.*;

class Duplicatevalues{
    public static void main(String arg[]){
        Scanner t=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(5);
        ll.add(6);
        ll.add(8);
        ll.add(5);
        ll.add(8);
        ll.add(10);

        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for (Integer num : ll) {
            if (tm.containsKey(num)) {
                tm.put(num, tm.get(num) + 1);
            } else {
                tm.put(num, 1);
            }
        }
        System.out.println(tm);
    }
}

