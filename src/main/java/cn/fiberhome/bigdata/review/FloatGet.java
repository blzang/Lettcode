package cn.fiberhome.bigdata.review;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整
 */
public class FloatGet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            float F = scanner.nextFloat();

            int T;

            T=(int)(F+0.5);
            System.out.println(T);
        }
    }
}
