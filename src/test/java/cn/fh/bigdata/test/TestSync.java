package cn.fh.bigdata.test;

import java.io.IOException;

public class TestSync {

    private static final Object lock=new Object();

    public static void main(String[] args) {

        Thread a=new Thread(new RunnA(1));

        Thread b=new Thread(new RunnA(2));

        a.start();
        b.start();

    }

    static class RunnA extends Thread {

        private int index;

        public RunnA(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            synchronized (lock){
                super.run();
                System.out.println("start "+index);

                try {
//                    this.wait();
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           /*     try {
                    System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                System.out.println("end "+index);
            }
        }
    }
}

