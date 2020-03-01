package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 *
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class Leetcode14 {

    @Test
    public  void test(){


        String [] strs={"abc","abx","asd","ab"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);


    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }

        int minLen=Integer.MAX_VALUE;

        String result="";

        for (String str : strs) {
            // 获取第一次出现最小的串
            if (str.length()<minLen){
                minLen=str.length();
                result=str;
            }
        }

        //      每次都减少一个字符
        while (result.length()>0){
            boolean flag=true;
            // 遍历字符串数组
            for (String str : strs) {
                if (!str.substring(0,minLen).equals(result)){
                    minLen--;

                    result=result.substring(0,minLen);
                    flag=false;
                    break;
                }
            }

            if (flag){
                return result;
            }
        }
        return result;
    };
}
