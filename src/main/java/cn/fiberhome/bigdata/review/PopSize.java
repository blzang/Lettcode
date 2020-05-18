package cn.fiberhome.bigdata.review;

import java.util.*;

/**
 * 给出一个名字，该名字有26个字符串组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 * 每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个字母拥有相同的“漂亮度”。字母忽略大小写。
     * 给出多个名字，计算每个名字最大可能的“漂亮度”。
 */
public class PopSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int num = scanner.nextInt();


            // 两个名字
            String [] arr=new String[2];
            for (int i = 0; i < num; i++) {
                int[] count=new int[26];
                arr[i]=scanner.next();
                int len=arr[i].length();

                for (int j = 0; j < len; j++) {
                    int asc=arr[i].charAt(j);
                    if (asc>='a'&& asc<='z'){
                        count[asc-97]++;
                    }else if (asc>='A' && asc<='Z' ){
                        count[asc-65]++;
                    }
                }

                Arrays.sort(count);

                int popSize=0;
                for (int i1 = 0; i1 < 26; i1++) {
                    popSize+=count[i1]*(i1+1);
                }
                System.out.println(popSize);

            }
        }
        scanner.close();
    }
}
