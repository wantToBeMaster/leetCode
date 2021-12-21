package com.hw.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * Created by huwei on 2021/12/21.
 */
public class Solution20 {
    static Map<String,String> map = new HashMap<>();
    static {
        map.put(")","(");
        map.put("]","[");
        map.put("}","{");
    }
    public static boolean isValid(String s) {
        String ss = "[{(";
        List<String> list = new ArrayList<>();
        String[] split = s.split("");
        for (int i = 0; i < split.length; i++) {
            if (ss.contains(split[i])){
                list.add(split[i]);
            }else{
                if (!list.get(list.size()-1).equals(map.get(split[i]))){
                    return false;
                }else{
                    list.remove(list.size()-1);
                }
            }
        }
        return list.isEmpty();
    }
    public static boolean isValid2(String s) {
        while(s.contains("()")||s.contains("{}")||s.contains("[]")){
            s = s.replace("()","").replace("{}","").replace("[]","");
        }
        return s.equals("");
    }

}
