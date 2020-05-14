package cn.fiberhome.bigdata.review;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 *
 * 0xA ->10
 */
public class HexConvert {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String substring = s.substring(2);

            int i = Integer.parseInt(substring, 16);
            System.out.println(i);
        }
    }
}
