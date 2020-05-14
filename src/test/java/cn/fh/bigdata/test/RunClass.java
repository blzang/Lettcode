package cn.fh.bigdata.test;

import java.util.concurrent.FutureTask;

public class RunClass {
    public static void main(String[] args) {

        FutureTask futureTask=new FutureTask(new ThreadB());

        Thread t=new Thread(futureTask);

        t.start();

        try {
            if (futureTask.get()!=null){

            }

        }catch (Exception e){
            e.printStackTrace();
            return;
        }

       new Thread(new Runnable() {
            public void run() {
                while (true){
                    System.out.println("-----------hellos");
                }
            }
        }).start();

    }
}
