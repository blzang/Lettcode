package cn.fiberhome.bigdata.review;

import java.util.*;

//23 删除字符串中出现次数最少的字符
//          输入例子:
//        abcdd
//        输出例子:
//        dd
public class DelStrMinRemain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuffer sb;
        String str = "";
        Map<Character, Integer> map ;

        while (scanner.hasNext()) {
            int min=Integer.MAX_VALUE;
            sb=new StringBuffer();
            map= new HashMap<>();
            String s = scanner.nextLine();
            // map填值
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
            // 获取最小的字符个数
            for (Integer value : map.values()) {
                min=Math.min(value,min);
            }

            // 遍历字符串
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.get(c)!=min){
                    sb.append(c);
                }
            }

            System.out.println(sb);

        }
    }
}
