package cn.fh.bigdata.test;

import java.util.concurrent.Callable;

public class ThreadB implements Callable {


    public String call() throws Exception {
        for (int i = 0; i < 500000000; i++) {
            if (i<480000000){
                System.out.println(Thread.currentThread().getName()+" -正在处理 "+ i);
            }else {
               throw new Exception("异常01234");
//                return "msg is error";
            }
        }
       
        return "msg is suc";
    }
}
