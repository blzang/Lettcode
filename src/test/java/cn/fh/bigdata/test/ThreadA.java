package cn.fh.bigdata.test;

public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {

            if (i<4800){
             /*   try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                System.out.println("正在处理 "+ i);
            }else {
                System.exit(0);
                return;
//                throw  new IllegalArgumentException("---异常抛出");
            }
        }
    }
}
