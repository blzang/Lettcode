package cn.fh.bigdata.datastructure;

public class MyCirQueue {
    private int [] array;

    // 队头
    private int front;

    // 队尾
    private int rear;


    public MyCirQueue(int capacticy){
        this.array=new int[capacticy];
    }

    /**
     * 入队
     * @throws Exception
     */
    public void  enQueue(int ele)throws Exception{
        if ((rear+1)%array.length==front){
            throw  new  Exception("队列已满！");
        }
        // 入队将尾部赋值
        array[rear]=ele;
        // 取余数
        rear=(rear+1)%array.length;
    }

    /**
     * 出队
     * @return
     * @throws Exception
     */
    public int deQueue() throws Exception{

        if (rear==front){
            throw new Exception("队列已空");
        }

        // 出队 将头部的值赋值
        int deQueueElement=array[front];

        front=(front+1)%array.length;

        return deQueueElement;
    }

    /**
     * 输出队列
     */
    public void output(){
        for (int i = front; i != rear; i=(i+1)%array.length) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) throws Exception {
        MyCirQueue myCirQueue=new MyCirQueue(6);


        // 入队
        myCirQueue.enQueue(3);
        myCirQueue.enQueue(5);
        myCirQueue.enQueue(6);
        myCirQueue.enQueue(8);
        myCirQueue.enQueue(1);


        // 出队
        myCirQueue.deQueue();
        myCirQueue.deQueue();
        myCirQueue.deQueue();

        myCirQueue.enQueue(2);
        myCirQueue.enQueue(4);
        myCirQueue.enQueue(9);

        System.out.println("---------------");
        myCirQueue.output();
    }
}
