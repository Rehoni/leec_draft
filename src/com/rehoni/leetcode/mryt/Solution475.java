package com.rehoni.leetcode.mryt;

import java.util.Arrays;

/**
 * 类<code>Doc</code>用于：475. 供暖器
 * 对于每个房屋，要么用前面的暖气，要么用后面的，二者取近的，得到距离；
 * 对于所有的房屋，选择最大的上述距离。
 *
 * @author luohao
 * @version 1.0
 * @date 2021/12/20 8:51
 */
public class Solution475 {
    public int findRadius(int[] houses, int[] heaters) {
        // 先进行升序排列
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int i = 0;
        int radius = 0;
        for (int house : houses) {
            // 如果小于则一直往右边找，直到找到房屋右侧的第一个供暖器
            while (i < heaters.length && heaters[i] < house) {
                i++;
            }
            if (i == 0) {
                // 边界条件一： i == 0 说明供暖器只有一个，且大于所有的house距离
                radius = Math.max(radius, heaters[i] - house);
            } else if (i == heaters.length) {
                // 边界条件二：i == heaters.length，说明最后一个供暖器
                return Math.max(radius, houses[houses.length - 1] - heaters[i - 1]);
            } else {
                // 房屋右侧的热水器和房屋左侧的热水器，取最近的那个供暖器的距离为最小半径
                radius = Math.max(radius, Math.min(house - heaters[i - 1], heaters[i] - house));
            }
        }
        return radius;
    }
}
