package com.hw.solution;

/**
 * 686. 重复叠加字符串匹配
 * 给定两个字符串 a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
 *
 * 注意：字符串 "abc" 重复叠加 0 次是 ""，重复叠加 1 次是 "abc"，重复叠加 2 次是 "abcabc"。
 * Created by huwei on 2021/12/22.
 */
public class Solution686 {
    public int repeatedStringMatch(String a, String b) {
        if(a.length()>b.length()){
            return a.contains(b)?1:(a+a).contains(b)?2:-1;
        }else if (a.length()==b.length()){
            if (a.equals(b)){
                return 1;
            }else{
                a = a+a;
                return a.contains(b)?2:-1;
            }
        }else{
            int i = 1;
            StringBuilder aBuilder = new StringBuilder(a);
            while(aBuilder.length()<(b.length()+2*a.length())){
                aBuilder.append(a);
                i++;
                if (aBuilder.toString().contains(b)){
                    return i;
                }
            }
            return -1;
        }
    }

}
