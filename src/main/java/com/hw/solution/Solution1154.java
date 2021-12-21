package com.hw.solution;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1154. 一年中的第几天
 * 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
 *
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 * Created by huwei on 2021/12/21.
 */
public class Solution1154 {
    private static Map<Integer,Integer> map;
    static{
        map = new HashMap<>();
        map.put(1,31);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
    }

    public static int dayOfYear(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        map.put(2,(year%400==0||(year%100!=0&&year%4==0))?29:28);

        int i = 0;
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers) {
            if (integer<month){
                i+=map.get(integer);
            }
        }
        i+=day;

        return i;
    }

    public static int dayOfYear2(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        boolean run = (year%400==0||(year%100!=0&&year%4==0));

        int[] ints = {1, 3, 5, 7, 8, 10, 12};
        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        month--;
        int i = month*30;

        for (;month>0;month--){
            if (month==2){
                i+=run?-1:-2;
            }else if (list.contains(month)){
                i++;
            }
        }


        i+=day;

        return i;
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear2("2004-03-01"));
        System.out.println(dayOfYear2("2003-03-01"));
        System.out.println(dayOfYear2("2019-02-10"));

    }
}
