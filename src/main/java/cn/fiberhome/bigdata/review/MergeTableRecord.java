package cn.fiberhome.bigdata.review;

import java.util.*;

/**
 * 数据表记录包含表索引和数值（int范围的整数），
 * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * 输出合并后的键值对（多行）
 * <p>
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * ----------------------------------
 * 0 3
 * 1 2
 * 3 4
 */
public class MergeTableRecord {

        public static void main(String[] args) {
    //        test1();

            Scanner scanner=new Scanner(System.in);
            List<Integer> list1=new ArrayList<>();
            List<Integer> list2=new ArrayList<>();

            while (scanner.hasNext()){
                int n= scanner.nextInt();


                // 将数据加入到两个队列中
                for (int i = 0; i < n; i++) {
                    String s = scanner.nextLine();
                    String[] split = s.split("\\s+");
                    list1.add(Integer.parseInt(split[0]));
                    list2.add(Integer.parseInt(split[1]));
                }
            }
            //数据清洗，对存放键值List遍历，并按照键值相同的value加起来存放在hashmap中
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i < list1.size(); i++) {
                if (map.containsKey(list1.get(i))){
                    Integer v = map.get(list1.get(i));
                    map.put(list1.get(i),list2.get(i)+v);
                }else {
                    map.put(list1.get(i),list2.get(i));
                }
            }

            List<Integer> list3=new ArrayList<>();
            list3.addAll(map.keySet());
            Collections.sort(list3);


            for (int i = 0; i < list3.size(); i++) {
                System.out.println(list3.get(i)+" "+map.get(list3.get(i)));
            }

        }

        private static void test1() {
        /*      String s="a n 0";
              String[] s1 = s.split("\\s+");

              for (int i = 0; i < s1.length; i++) {
                  System.out.println(s1[i]);
              }*/

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            list.add(10);
            list.add(5);
            list.add(4);

    //        Collections.sort(list);
            Collections.sort(list, new Comparator<Integer>() {
                // 降序
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });

            System.out.println(list);
        }
}
