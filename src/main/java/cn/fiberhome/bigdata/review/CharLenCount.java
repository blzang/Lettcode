package cn.fiberhome.bigdata.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class CharLenCount {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String sOrign = scanner.nextLine();

        String sByte = scanner.nextLine();


        long l = evalateCount(sOrign, sByte);
        System.out.println(l);


    }

    private static long evalateCount(String sOrign, String sByte) {
        Map<String,Long> map=new HashMap<>();
        for (int i = 0; i < sOrign.length(); i++) {
            String charStr=String.valueOf(sOrign.charAt(i)).toUpperCase();
            if (map.containsKey(charStr)){
                Long aLong = map.get(charStr);
                map.put(charStr,++aLong);
            }else {
                map.put(charStr,1L);
            }
        }

        return map.get(sByte.toUpperCase())==null?0:map.get(sByte.toUpperCase());

    }
}
