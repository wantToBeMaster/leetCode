package com.hw.solution;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *  
 *
 * 示例：
 *
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/14.
 */
public class Test557 {
    public static String reverseWords2(String s) {
        StringBuffer sb = new StringBuffer();
        int left = 0;
        int right = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)==' '){
                right = i;
            }
        }
        return sb.toString();
    }


    public static String reverseWords(String s) {
        String s2 = reverseRecursive(s);
//        String[] s1 = s2.split(" ");
//        StringBuffer sb = new StringBuffer();
//        for (int i = s1.length-1;i>=0;i--){
//            sb.append(s1[i]);
//            sb.append(" ");
//        }
//        sb.delete(sb.length()-1,sb.length());
//        return sb.toString();
        String[] s1 = s2.split(" ");
        String s3 = reverseRecursive2(s1);
        return s3;
    }

    //字符串反转
    public static String reverseRecursive(String s){
        int length = s.length();
        if(length<=1){
            return s;
        }
        String left  = s.substring(0,length/2);
        String right = s.substring(length/2 ,length);
        String afterReverse = reverseRecursive(right)+reverseRecursive(left);//此处是递归的方法调用
        return afterReverse;
    }
    //字符串反转
    public static String reverseRecursive2(String[] s){
        int length = s.length;
        if(length<=1){
            return s[0];
        }
        String[] left = new String[length/2];
        int leftIndex = 0;
        String[] right = new String[length-length/2];
        int rightIndex = 0;
        for (int i=0;i<length;i++){
            if (i<length/2){
                left[leftIndex] = s[i];
                leftIndex++;
            }else{
                right[rightIndex] = s[i];
                rightIndex++;
            }
        }

        String afterReverse = reverseRecursive2(right)+" "+reverseRecursive2(left);//此处是递归的方法调用
        return afterReverse;
    }

    public static void main(String[] args) {
        String s = reverseWords("Let's take LeetCode contest");
        String[] s1 = s.split(" ");

        System.out.println(s);
    }
}
