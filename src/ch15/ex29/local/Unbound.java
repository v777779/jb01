package ch15.ex29.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 20.03.2017.
 */
public class Unbound {
    List list1;
    List<?> list2;
    List <?extends Object> list3;

    void assign1(List list) {
        System.out.println("List list:");
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println("list3:"+list3);
    }
    void assign2(List<?> list) {
        System.out.println("List<?> list:");
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println("list3:"+list3);
    }
    void assign3(List<? extends Object> list) {
        System.out.println("List<? extends Object> list:");
        list1 = list;
        list2 = list;
        list3 = list;
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println("list3:"+list3);
    }


    public void app() {
        System.out.println("New ArrayList()");
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());
        System.out.println("New ArrayList<String>()");
        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());
        List<?> wList = new ArrayList();
        wList = new ArrayList<String>();
        System.out.println("New ArrayList<wildlist>()");
        assign1(wList);
        assign2(wList);
        assign3(wList);







    }

}
