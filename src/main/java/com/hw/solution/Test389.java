package com.hw.solution;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/18.
 */
public class Test389 {
    public static char findTheDifference(String s, String t) {
        String ss = s + t;
        int[] ints = new int[26];
        String sss = "abcdefghigklmnopqrstuvwxyz";
        char[] chars = ss.toCharArray();
        for(char c:chars){
            ints[c - 'a']++;
        }
        for (int i = 0;i<ints.length;i++){
            if (ints[i]%2==1){
                return sss.charAt(i);
            }
        }
        return 'a';
    }

    public static void main(String[] args) {
        char theDifference = findTheDifference("", "f");
        System.out.println(theDifference);
//        System.out.println('d' - 'a');
//        System.out.println('a' + 3);

    }
}
