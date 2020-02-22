package cn.fiberhome.bigdata.leetcode;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add("1");
        list.add(2);
        list.add("你该aa");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
