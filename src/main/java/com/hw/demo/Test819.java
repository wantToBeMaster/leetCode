package com.hw.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
 * banned = ["hit"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/most-common-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/14.
 */
public class Test819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String s = paragraph.toLowerCase();
        String[] split = s.split("\\W");
        HashMap<String, Integer> map = new HashMap<>();
        for (String black:banned){
            map.put(black,0);
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0;i<split.length;i++){
            if (map.containsKey(split[i])){
                Integer integer = map.get(split[i]);
                if (integer!=0){
                    map.put(split[i],integer+1);
                    if (integer+1>max){
                        max = integer+1;
                        maxIndex = i;
                    }
                }
            }else{
                map.put(split[i],1);
                if (max==0){
                    max = 1;
                    maxIndex = i;
                }
            }
        }

        return split[maxIndex];
    }

    public static void main(String[] args) {
        String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
//        String s1 = mostCommonWord(s, banned);
//        System.out.println(s.replaceAll("\\W"," "));
//        System.out.println(s.split("\\W")[0]);
//        System.out.println(s.split("\\W")[1]);
//        System.out.println(s1);
        String[] split = s.split("\\W+");
        for (String ss:split){
            System.out.println(ss);
        }
//        System.out.println(s.split("\\W"));
    }
}
