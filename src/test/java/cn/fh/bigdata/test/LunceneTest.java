package cn.fh.bigdata.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LunceneTest {

    @Test
    public void test1(){
        System.out.println("hello world");
    }



    @Test
    public void test2s(){
        ArrayList list1=new ArrayList<String>();

        list1.add("12321");
        list1.add("12322");
        list1.add("1232=3");
        list1.add("12321=4");
        for (Object o : list1) {
            System.out.println(o);
        }
        System.out.println(list1);
    }
}
