package Nov.ex_21112024_LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab099_AL_Iterate {
    public static void main(String[] args) {
        List <String> l = new ArrayList();
        l.add("man");
        l.add("San");
        l.add("Pn");

        System.out.println("1--To print ArrayList");

        for (String str:l){
            System.out.println(str);
        }

        System.out.println("2--To print usring for");

        for (int i =0; i <l.size();i++){
            System.out.println(l.get(i));
        }

        System.out.println("3--Using iterator");

        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
