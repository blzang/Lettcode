package cn.fiberhome.bigdata.review;

import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 *
 * 最后一个数后面也要有空格
 *
 * 链接：https://www.nowcoder.com/questionTerminal/196534628ca6490ebce2e336b47b3607?f=discussion
 * 来源：牛客网
 *
 * 好多人没明白这个问题的意思，其实就是让你把输入的整数因式分解，只不过因子必须都是质数
 * 例如：180 = 2 * 2 * 3 * 3 * 5；90 = 2 * 3 * 3 * 5；而不是找出所有的质数因子
 */
public class PrimerFactorGet {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long num=0;
        while (scanner.hasNext()){
            num=scanner.nextLong();
            isPrimerFactor(num);
        }
    }

    private static void isPrimerFactor(long num) {
        long number = num;
        while(number != 1)
        {
            for(int i = 2; i <= number ;i++)
            {
                // 求余数
                if(number % i == 0)
                {
                    // 求商
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
