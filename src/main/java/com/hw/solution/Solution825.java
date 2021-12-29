package com.hw.solution;

import java.util.Arrays;

/**
 * 825. 适龄的朋友
 * 在社交媒体网站上有 n 个用户。给你一个整数数组 ages ，其中 ages[i] 是第 i 个用户的年龄。
 *
 * 如果下述任意一个条件为真，那么用户 x 将不会向用户 y（x != y）发送好友请求：
 *
 * age[y] <= 0.5 * age[x] + 7
 * age[y] > age[x]
 * age[y] > 100 && age[x] < 100
 * 否则，x 将会向 y 发送一条好友请求。
 *
 * 注意，如果 x 向 y 发送一条好友请求，y 不必也向 x 发送一条好友请求。另外，用户不会向自己发送好友请求。
 *
 * 返回在该社交媒体网站上产生的好友请求总数。
 * Created by huwei on 2021/12/27.
 */
public class Solution825 {
    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int cnt = 0;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                if (i==j) continue;
                if(isFriend(ages[i],ages[j])) cnt++;
            }
        }
        return cnt;
    }

    public static int numFriendRequests2(int[] ages) {
        Arrays.sort(ages);
        int cnt = 0;
        for (int i = 0; i < ages.length; i++) {
            int left  = i-1;
            int right  = i+1;
            while(left>=0){
                if (isFriend(ages[i],ages[left])) {
                    cnt++;
                    left--;
                } else{
                    break;
                }
            }
            while(right<ages.length){
                if (isFriend(ages[i],ages[right])){
                    cnt++;
                    right++;
                }else{
                    break;
                }
            }
        }
        return cnt;
    }

    public static int numFriendRequests3(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        for (int k = 0, i = 0, j = 0; k < n; k++) {
            while (i < k && !isFriend(ages[i], ages[k])) i++;
            if (j < k) j = k;
            while (j < n && isFriend(ages[j], ages[k])) j++;
            if (j > i) ans += j - i - 1;
        }
        return ans;
    }

    public static boolean isFriend(int i,int j){
        if (i<14) return false;
        if (j<=(0.5*i+7)){
            return false;
        }
        if (j>i){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{73,106,39,6,26,15,30,100,71,35,46,112,6,60,110};
        int i = numFriendRequests3(ints);
        System.out.println(i);
    }
}
