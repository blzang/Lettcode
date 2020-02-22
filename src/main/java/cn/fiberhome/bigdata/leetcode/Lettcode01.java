package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class Lettcode01 {

    @Test
    public void  test(){
        int [] nums={2,7,11,15};
        int target=9;

        System.out.println(twoSum1(nums,target));
    }

    int []arr=new int[2];

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length ; j++) {
                if (target==nums[i]+nums[j]){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return  new  int[]{-1,-1};
    }


    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }

        return new  int[]{-1,-1};
    }
}
