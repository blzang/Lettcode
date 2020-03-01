package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 *
 * 输入: 121
 * 输出: true
 *
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Lettcode09 {

    @Test
    public void test(){
        boolean palindrame = isPalindrame2(1221);
        System.out.println(palindrame);
    }

    public boolean isPalindrame(int x){

        int temp=x;
        if (x==0) return true;
        if (x<0) return  false;

        int rev=0;
        int newrev=0;
        while ( x!=0){
            newrev= (rev * 10) +(x % 10);
            if(rev!=(newrev-x%10)/10){
                return false;
            }
            rev=newrev;
            x/=10;
        }

        return  rev==temp;
    }


    public boolean isPalindrame2(int x){

        if (x==0){return true;}

        if (x<0) {return  false;}

        if (x%10==0) return false;

        int num=0;

        while (num<x){
            // 啥
            num=num*10+x %10;
            x/=10;
        }

        return num==x || num / 10==x;
    }
}
