package cn.fiberhome.bigdata.review;

import java.util.Scanner;
import java.util.TreeMap;

public class MergeTable2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            TreeMap<Integer,Integer> map=new TreeMap<>();
            int n = scanner.nextInt();
            for (int j = 0; j <n ; j++) {
                int m = scanner.nextInt();
                int value = scanner.nextInt();
                if (map.containsKey(m)) {
                    map.put(m, map.get(m) + value);
                } else
                    map.put(m, value);
            }

            for (Integer key : map.keySet()) {
                System.out.println(key+" "+map.get(key));
            }
        }
    }
}
