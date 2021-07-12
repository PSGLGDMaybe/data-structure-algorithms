package com.wuhaitao.learning.datastructurealgorithms.leetcode.array.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wuhaitao
 * @Classname ContainsDuplicate
 * @Description TODO
 * @Date 2021/7/12 11:51
 * @Created by wuhaitao
 */
public class ContainsDuplicate {
    /**
     *
     * 题目：
     *      给定一个整数数组，判断是否存在重复元素。
     *      如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     *
     * 分析：
     *      1. 排序然后如果相同 则前后两个元素相等可判定数组有重复元素
     *
     *      2. 运用hash的思想 如果有重复元素则会插入数据失败
     *
     *      3. 去重 然后比较长度 （方式很不好，因为只要有一个重复就可以判断进行返回，
     *         去重会将多个重复的值进行去重操作导致后面的操作无效）
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        //特殊情况
        if(nums == null || nums.length <= 1) {
            return false;
        }

        Set<Integer> set = new HashSet<>(nums.length);

        for(int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
